package core.course;

import core.student.Student;
import core.student.StudentsUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.gui.GUI_Util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.ArrayList;

import static util.Statics.*;

public class Course {

    final static int COLUMN_COUNT = 4;
    private final int id;
    private final Row row;
    private String name;
    private String teacherName;
    private String year;

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

    public void setName(String name) throws IOException {
        this.row.getCell(1).setCellValue(name);
        updateSheet(COURSES_SHEET);
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) throws IOException {
        this.row.getCell(2).setCellValue(teacherName);
        updateSheet(COURSES_SHEET);
        this.teacherName = teacherName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) throws IOException {
        this.row.getCell(3).setCellValue(year);
        updateSheet(COURSES_SHEET);
        this.year = year;
    }

    public void renderStudentsToTable(JTable table) {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        String[] headers = new String[Student.COLUMN_COUNT - 3];

        headers[0] = STUDENTS_SHEET.getRow(1).getCell(0).getRichStringCellValue().getString();
        headers[1] = STUDENT_NAME_TXT;
        headers[2] = STUDENTS_SHEET.getRow(1).getCell(3).getRichStringCellValue().getString();
        for (int i = 6; i < Student.COLUMN_COUNT; i++) {
            headers[i - 3] = STUDENTS_SHEET.getRow(1).getCell(i).getRichStringCellValue()
                    .getString();
        }

        ArrayList<Object[]> data = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            Row r = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(r.getCell(0))) {
                continue;
            }
            Object[] rowArray = new Object[Student.COLUMN_COUNT - 3];
            rowArray[0] = r.getCell(0);
            rowArray[1] = r.getCell(1) + SPACE + r.getCell(2) + SPACE + r.getCell(4) + SPACE
                    + r.getCell(5);
            rowArray[2] = r.getCell(3);
            for (int j = 6; j < Student.COLUMN_COUNT; j++) {
                rowArray[j - 3] = r.getCell(j);
                if (GUI_Util.isImageCellString(rowArray[j - 3].toString())) {
                    rowArray[j - 3] = GUI_Util.setImageIconToSize(
                            GUI_Util.getImageIconFromCellString(
                                    rowArray[j - 3].toString()),
                            table.getWidth() / (Student.COLUMN_COUNT - 3),
                            table.getRowHeight());
                }
            }
            if ((int) ((Cell) rowArray[10]).getNumericCellValue() == id) {
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
