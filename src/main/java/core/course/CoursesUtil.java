package core.course;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.Statics;

public class CoursesUtil {

    public static void createCourse(String name, String teacherName, String year)
            throws IOException {
        Cell c = Statics.COURSES_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = Statics.COURSES_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1);
        CourseRow.createCell(1).setCellValue(name);
        CourseRow.createCell(2).setCellValue(teacherName);
        CourseRow.createCell(3).setCellValue(year);
        c.setCellValue(preValue + 1); // max value will get addition 1
        Statics.updateSheet(Statics.COURSES_SHEET);
    }

    public static DefaultTableModel getCoursesAsTable() {
        // TODO use buildTableModel from GUI_Util instead ..
        final int columnCount = 4;
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = Statics.COURSES_SHEET.getRow(1).getCell(i)
                    .getRichStringCellValue().getString();
        }
        Cell c = Statics.COURSES_SHEET.getRow(0).getCell(1);
        int startValue = 2;
        int max = (int) c.getNumericCellValue() + 2;
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
    }

    public static DefaultComboBoxModel getYearsAsComboBox() {
        return new DefaultComboBoxModel(new String[]{"أريد إدخال نصاً مختلفاً", "بستان", "تمهيدي"});
    }
}
