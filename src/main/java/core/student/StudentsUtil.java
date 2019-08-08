package core.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.STUDENTS_SHEET;
import static util.Statics.cellIsNull0OrBlank;
import static util.Statics.updateSheet;
import util.gui.GUI_Util;

public class StudentsUtil {

    public static void createStudent(String firstName, String fatherName, String motherName,
            String grandFatherName, String lastName, Date birthDate, String identitiyNumber,
            String guardianName, String guardianJob, String guardianPhone, String citizenOrRefugee,
            String address, int courseId)
            throws IOException {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = STUDENTS_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1);
        CourseRow.createCell(1).setCellValue(firstName);
        CourseRow.createCell(2).setCellValue(fatherName);
        CourseRow.createCell(3).setCellValue(motherName);
        CourseRow.createCell(4).setCellValue(grandFatherName);
        CourseRow.createCell(5).setCellValue(lastName);
        CourseRow.createCell(6).setCellValue(birthDate);
        CourseRow.createCell(7).setCellValue(identitiyNumber);
        CourseRow.createCell(8).setCellValue(guardianName);
        CourseRow.createCell(9).setCellValue(guardianJob);
        CourseRow.createCell(10).setCellValue(guardianPhone);
        CourseRow.createCell(11).setCellValue(citizenOrRefugee);
        CourseRow.createCell(12).setCellValue(address);
        CourseRow.createCell(13).setCellValue(courseId);
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(STUDENTS_SHEET);
    }

    public static DefaultTableModel getStudentsAsTable() {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        ArrayList<Row> rows = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            Row row = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            rows.add(row);
        }
        return GUI_Util.buildTableModel(rows, Student.COLUMN_COUNT);
    }

    public static DefaultComboBoxModel getcitizenOrRefugeeAsComboBox() {
        return new DefaultComboBoxModel(new String[]{"مواطن", "لاجئ", "غير ذلك"});
    }

    private StudentsUtil() {
    }

}
