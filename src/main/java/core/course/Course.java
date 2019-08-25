package core.course;

import core.student.Student;
import core.student.StudentsUtil;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.COURSES_SHEET;
import static util.Statics.updateSheet;

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

    public DefaultTableModel getStudentsAsTable() {
        /* TODO implement this code
        final int columnCount = 4;
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = Statics.COURSES_SHEET.getRow(1).getCell(i)
                    .getRichStringCellValue().getString();
        }
        Cell c = Statics.COURSES_SHEET.getRow(0).getCell(1);
        int startValue = 2;
        int max = (int) c.getNumericCellValue() + startValue;
        ArrayList<Object[]> rows = new ArrayList<>(max - startValue);
        for (int i = startValue; i < max; i++) {
            Object[] row = new Object[columnCount];
            for (int j = 0; j < columnCount; j++) {
                row[j] = Statics.COURSES_SHEET.getRow(i).getCell(j);
            }
            if (row[0].toString().equals("")) {
                continue;
            }
            rows.add(row);
        }
        return new DefaultTableModel(
                rows.toArray(new Object[rows.size()][columnCount]), columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // for preventing any cell edit
                return false;
            }
        };
         */
        throw new UnsupportedOperationException("This operation is not supported yet");
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
