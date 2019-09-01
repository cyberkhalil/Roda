package core.course;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.gui.GUI_Util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.ArrayList;

import static util.Statics.*;

public class CoursesUtil {

    private CoursesUtil() {
    }

    public static void createCourse(String name, String teacherName, String year)
            throws IOException {
        Cell c = COURSES_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = COURSES_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1); //id
        CourseRow.createCell(1).setCellValue(name);
        CourseRow.createCell(2).setCellValue(teacherName);
        CourseRow.createCell(3).setCellValue(year);
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(COURSES_SHEET);
    }

    public static DefaultTableModel getCoursesAsTable() {
        return GUI_Util.buildTableModel(getCoursesAsRows(), Course.COLUMN_COUNT);
    }

    public static DefaultComboBoxModel<String> getYearsAsComboBox() {
        return new DefaultComboBoxModel<>(new String[]{ANOTHER_AGE_TXT, BOSTAN_TXT, TAMHEDY_TXT});
    }

    public static DefaultComboBoxModel getCoursesAsComboBox() {
        return GUI_Util.buildComboBoxModel(getCoursesAsRows(), 0, 1);
    }

    private static ArrayList<Row> getCoursesAsRows() {
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
        return rows;
    }
}
