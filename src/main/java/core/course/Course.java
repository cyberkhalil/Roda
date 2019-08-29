package core.course;

import core.student.Student;
import core.student.StudentsUtil;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.COURSES_SHEET;
import static util.Statics.STUDENTS_SHEET;
import static util.Statics.cellIsNull0OrBlank;
import static util.Statics.updateSheet;
import util.gui.GUI_Util;

public class Course {

    private final int id;
    private String name;
    private String teacherName;
    private String year;

    private final Row row;
    public final static int COLUMN_COUNT = 4;

    public Course(int id) {
        this.row = COURSES_SHEET.getRow(id + 1);
        this.id = (int) row.getCell(0).getNumericCellValue();
        this.name = row.getCell(1).getRichStringCellValue().getString();
        this.teacherName = row.getCell(2).getRichStringCellValue().getString();
        this.year = row.getCell(3).getRichStringCellValue().getString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getYear() {
        return year;
    }

    public int getStudentsNumber() {
        ArrayList<Student> students = StudentsUtil.getStudents();
        students.stream().filter(
                (student) -> (student.getCourseId() == id)).forEachOrdered((student) -> {
                    students.remove(student);
                });
        return students.size();
    }

    public void renderStudentsToTable(JTable table) {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        String[] headers = new String[Student.COLUMN_COUNT - 3];

        headers[0] = STUDENTS_SHEET.getRow(1).getCell(0).getRichStringCellValue().getString();
        headers[1] = "اسم الطالب";
        headers[2] = STUDENTS_SHEET.getRow(1).getCell(3).getRichStringCellValue().getString();
        for (int i = 6; i < Student.COLUMN_COUNT; i++) {
            headers[i - 3] = STUDENTS_SHEET.getRow(1).getCell(i).getRichStringCellValue()
                    .getString();
        }

        ArrayList<Object[]> data = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            Row row = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            Object[] rowArray = new Object[Student.COLUMN_COUNT - 3];
            rowArray[0] = row.getCell(0);
            rowArray[1] = row.getCell(1) + " " + row.getCell(2) + " " + row.getCell(4) + " "
                    + row.getCell(5);
            rowArray[2] = row.getCell(3);
            for (int j = 6; j < Student.COLUMN_COUNT; j++) {
                rowArray[j - 3] = row.getCell(j);
                if (GUI_Util.isImageCellString(rowArray[j - 3].toString())) {
                    rowArray[j - 3] = GUI_Util.setImageIconToSize(
                            GUI_Util.getImageIconFromCellString(
                                    rowArray[j - 3].toString()),
                            table.getWidth() / (Student.COLUMN_COUNT - 3),
                            table.getRowHeight());
                }
            }
            if ((int) rowArray[10] == id) {
                data.add(rowArray);
            }
        }
        table.setModel(new DefaultTableModel(
                data.toArray(new Object[data.size()][Student.COLUMN_COUNT - 3]), headers) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // for preventing any cell edit
                return false;
            }
        });
    }

    public void setName(String name) throws IOException {
        this.row.getCell(1).setCellValue(name);
        updateSheet(COURSES_SHEET);
        this.name = name;
    }

    public void setTeacherName(String teacherName) throws IOException {
        this.row.getCell(2).setCellValue(teacherName);
        updateSheet(COURSES_SHEET);
        this.teacherName = teacherName;
    }

    public void setYear(String year) throws IOException {
        this.row.getCell(3).setCellValue(year);
        updateSheet(COURSES_SHEET);
        this.year = year;
    }

    public void delete() throws IOException {
        for (int i = 0; i < COLUMN_COUNT; i++) {
            this.row.getCell(i).setBlank();
        }
        this.row.setZeroHeight(true);
        updateSheet(COURSES_SHEET);
        this.name = null;
        this.teacherName = null;
        this.year = null;
        ArrayList<Student> students = StudentsUtil.getStudents();
        for (Student s : students) {
            if (s.getCourseId() == id) {
                s.setCourse(0);
            }
        }
    }

}
