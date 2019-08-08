package core.course;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import util.Statics;

public class Course {

    private final int id;
    private String name;
    private String teacherName;
    private String year;
    private Row row;
    private final int columnCount = 4;

    public Course(int id) {
        this.row = Statics.COURSES_SHEET.getRow(id + 1);
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

    public void setName(String name) throws IOException {
        this.row.getCell(1).setCellValue(name);
        this.name = name;
        Statics.updateSheet(Statics.COURSES_SHEET);
    }

    public void setTeacherName(String teacherName) throws IOException {
        this.row.getCell(2).setCellValue(teacherName);
        this.teacherName = teacherName;
        Statics.updateSheet(Statics.COURSES_SHEET);
    }

    public void setYear(String year) throws IOException {
        this.row.getCell(3).setCellValue(year);
        this.year = year;
        Statics.updateSheet(Statics.COURSES_SHEET);
    }

    public void delete() throws IOException {
        for (int i = 0; i < columnCount; i++) {
            this.row.getCell(i).setBlank();
        }
        Statics.updateSheet(Statics.COURSES_SHEET);
        this.row = null;
        this.name = null;
        this.teacherName = null;
        this.year = null;
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
}
