package core.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JTable;
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
            String address, int courseId, String imgPath)
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
        CourseRow.createCell(14).setCellValue(GUI_Util.setImageIconAsStringToCell(imgPath));
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(STUDENTS_SHEET);
    }

    public static void getStudentsFormatedAsTable(JTable tabel) {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        String[] headers = new String[Student.COLUMN_COUNT - 3];

        headers[0] = STUDENTS_SHEET.getRow(1).getCell(0).getRichStringCellValue().getString();
        headers[1] = "اسم الطالب";
        headers[2] = STUDENTS_SHEET.getRow(1).getCell(3).getRichStringCellValue().getString();
        for (int i = 6; i < Student.COLUMN_COUNT; i++) {
            headers[i - 3] = STUDENTS_SHEET.getRow(1).getCell(i)
                    .getRichStringCellValue().getString();
        }

        ArrayList<Object[]> data = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            Row row = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            Object[] rowArray = new Object[Student.COLUMN_COUNT - 3];
            rowArray[0] = row.getCell(0);
            rowArray[1] = row.getCell(1) + " " + row.getCell(2) + " " + row.getCell(4)
                    + " " + row.getCell(5);
            rowArray[2] = row.getCell(3);
            for (int j = 6; j < Student.COLUMN_COUNT; j++) {
                rowArray[j - 3] = row.getCell(j);
                if (GUI_Util.isImageCellString(rowArray[j - 3].toString())) {
                    rowArray[j - 3]
                            = GUI_Util.setImageIconToSize(
                                    GUI_Util.getImageIconFromCellString(rowArray[j - 3].toString()),
                                    tabel.getWidth() / (Student.COLUMN_COUNT - 3),
                                    tabel.getRowHeight());
                }
            }
            data.add(rowArray);
        }
        tabel.setModel(new DefaultTableModel(
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

    public static DefaultComboBoxModel getcitizenOrRefugeeAsComboBox() {
        return new DefaultComboBoxModel(new String[]{"مواطن", "لاجئ", "غير ذلك"});
    }

    private StudentsUtil() {
    }

}
