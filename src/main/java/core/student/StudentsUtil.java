package core.student;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.gui.GUI_Util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static util.Statics.*;

public class StudentsUtil {

    private StudentsUtil() {
    }

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

    public static void renderStudentsFormatedToTable(JTable table) {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        String[] headers = new String[Student.COLUMN_COUNT - 3];

        headers[0] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(0));
        headers[1] = STUDENT_NAME_TXT;
        headers[2] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(3));
        for (int i = 6; i < Student.COLUMN_COUNT; i++) {
            headers[i - 3] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(i));
        }

        ArrayList<Object[]> data = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            Row row = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            Object[] rowArray = new Object[Student.COLUMN_COUNT - 3];
            rowArray[0] = row.getCell(0);
            rowArray[1] = row.getCell(1) + SPACE + row.getCell(2) + SPACE + row.getCell(4) + SPACE
                    + row.getCell(5);
            rowArray[2] = row.getCell(3);
            for (int j = 6; j < Student.COLUMN_COUNT; j++) {
                rowArray[j - 3] = row.getCell(j);
                if (GUI_Util.isImageCellString(rowArray[j - 3].toString())) {
                    rowArray[j - 3]
                            = GUI_Util.setImageIconToSize(
                                    GUI_Util.getImageIconFromCellString(rowArray[j - 3].toString()),
                                    table.getWidth() / (Student.COLUMN_COUNT - 3),
                                    table.getRowHeight());
                }
            }
            data.add(rowArray);
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

    public static ArrayList<Student> getStudents() {
        Cell c = STUDENTS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            Row row = STUDENTS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            students.add(new Student((int) row.getCell(0).getNumericCellValue()));
        }
        return students;
    }

    public static DefaultTableModel getStudentsAsTable(ArrayList<Student> students) {
        String[] headers = new String[Student.COLUMN_COUNT - 5];

        headers[0] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(0));
        headers[1] = STUDENT_NAME_TXT;
        headers[2] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(3));
        for (int i = 6; i < Student.COLUMN_COUNT - 2; i++) {
            headers[i - 3] = getStringFromCell(STUDENTS_SHEET.getRow(1).getCell(i));
        }

        ArrayList<Object[]> data = new ArrayList<>();
        students.stream().map((s) -> {
            Object[] rowArray = new Object[Student.COLUMN_COUNT - 5];
            rowArray[0] = s.getId();
            rowArray[1] = s.getFullName();
            rowArray[2] = s.getMotherName();
            rowArray[3] = s.getBirthDate();
            rowArray[4] = s.getIdentityNumber();
            rowArray[5] = s.getGuardianName();
            rowArray[6] = s.getGuardianJob();
            rowArray[7] = s.getGuardianPhone();
            rowArray[8] = s.getCitizenOrRefugee();
            rowArray[9] = s.getAddress();
            return rowArray;
        }).forEachOrdered((rowArray) -> {
            data.add(rowArray);
        });

        return new DefaultTableModel(
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
        };
    }

}
