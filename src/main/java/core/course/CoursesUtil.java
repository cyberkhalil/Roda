package core.course;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.COURSES_SHEET;
import static util.Statics.cellIsNull0OrBlank;
import static util.Statics.updateSheet;
import util.gui.GUI_Util;

public class CoursesUtil {

    public static void createCourse(String name, String teacherName, String year)
            throws IOException {
        Cell c = COURSES_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = COURSES_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1);
        CourseRow.createCell(1).setCellValue(name);
        CourseRow.createCell(2).setCellValue(teacherName);
        CourseRow.createCell(3).setCellValue(year);
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(COURSES_SHEET);
    }

    public static DefaultTableModel getCoursesAsTable() {
        Cell c = COURSES_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        ArrayList<Row> rows = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            Row row = COURSES_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            rows.add(row);
        }
        return GUI_Util.buildTableModel(rows, Course.COLUMN_COUNT);
    }

    public static DefaultComboBoxModel getYearsAsComboBox() {
        return new DefaultComboBoxModel(new String[]{"أريد إدخال نصاً مختلفاً", "بستان", "تمهيدي"});
    }

    public static DefaultComboBoxModel getCoursesAsComboBox() {
        // TODO implement this method
        throw new UnsupportedOperationException("This opertaion is not supported yet");
    }

    private CoursesUtil() {
    }
}
