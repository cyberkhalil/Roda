package core.student;

import core.item.Item;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.gui.GUI_Util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static util.Statics.*;

public class Student {

    public final static int COLUMN_COUNT = 15;
    private final int id;
    private final Row row;
    private String firstName;
    private String fatherName;
    private String motherName;
    private String grandFatherName;
    private String lastName;
    private String birthDate;
    private String identitiyNumber;
    private String guardianName;
    private String guardianJob;
    private String guardianPhone;
    private String citizenOrRefugee;
    private String address;
    private int courseId;
    private String image;

    public Student(int id) {
        this.row = STUDENTS_SHEET.getRow(id + 1);
        this.id = (int) row.getCell(0).getNumericCellValue();
        this.firstName = row.getCell(1).getRichStringCellValue().getString();
        this.fatherName = row.getCell(2).getRichStringCellValue().getString();
        this.motherName = row.getCell(3).getRichStringCellValue().getString();
        this.grandFatherName = row.getCell(4).getRichStringCellValue().getString();
        this.lastName = row.getCell(5).getRichStringCellValue().getString();
        this.birthDate = row.getCell(6).getRichStringCellValue().getString();
        this.identitiyNumber = row.getCell(7).getRichStringCellValue().getString();
        this.guardianName = row.getCell(8).getRichStringCellValue().getString();
        this.guardianJob = row.getCell(9).getRichStringCellValue().getString();
        this.guardianPhone = row.getCell(10).getRichStringCellValue().getString();
        this.citizenOrRefugee = row.getCell(11).getRichStringCellValue().getString();
        this.address = row.getCell(12).getRichStringCellValue().getString();
        this.courseId = (int) row.getCell(13).getNumericCellValue();
        this.image = row.getCell(14).getRichStringCellValue().getString();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IOException {
        this.row.getCell(1).setCellValue(firstName);
        updateSheet(STUDENTS_SHEET);
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) throws IOException {
        this.row.getCell(2).setCellValue(fatherName);
        updateSheet(STUDENTS_SHEET);
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) throws IOException {
        this.row.getCell(3).setCellValue(motherName);
        updateSheet(STUDENTS_SHEET);
        this.motherName = motherName;
    }

    public String getGrandFatherName() {
        return grandFatherName;
    }

    public void setGrandFatherName(String grandFatherName) throws IOException {
        this.row.getCell(4).setCellValue(grandFatherName);
        updateSheet(STUDENTS_SHEET);
        this.grandFatherName = grandFatherName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IOException {
        this.row.getCell(5).setCellValue(lastName);
        updateSheet(STUDENTS_SHEET);
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + SPACE + fatherName + SPACE + grandFatherName + SPACE + lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) throws IOException {
        String date = SIMPLE_DF.format(birthDate);
        this.row.getCell(6).setCellValue(date);
        updateSheet(STUDENTS_SHEET);
        this.birthDate = date;
    }

    public String getIdentityNumber() {
        return identitiyNumber;
    }

    public void setIdentityNumber(String identitiyNumber) throws IOException {
        this.row.getCell(7).setCellValue(identitiyNumber);
        updateSheet(STUDENTS_SHEET);
        this.identitiyNumber = identitiyNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) throws IOException {
        this.row.getCell(8).setCellValue(guardianName);
        updateSheet(STUDENTS_SHEET);
        this.guardianName = guardianName;
    }

    public String getGuardianJob() {
        return guardianJob;
    }

    public void setGuardianJob(String guardianJob) throws IOException {
        this.row.getCell(9).setCellValue(guardianJob);
        updateSheet(STUDENTS_SHEET);
        this.guardianJob = guardianJob;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) throws IOException {
        this.row.getCell(10).setCellValue(guardianPhone);
        updateSheet(STUDENTS_SHEET);
        this.guardianPhone = guardianPhone;
    }

    public String getCitizenOrRefugee() {
        return citizenOrRefugee;
    }

    public void setCitizenOrRefugee(String citizenOrRefugee) throws IOException {
        this.row.getCell(11).setCellValue(citizenOrRefugee);
        updateSheet(STUDENTS_SHEET);
        this.citizenOrRefugee = citizenOrRefugee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws IOException {
        this.row.getCell(12).setCellValue(address);
        updateSheet(STUDENTS_SHEET);
        this.address = address;
    }

    public double getBalance() {
        double balance = 0;
        Cell c = STUDENTS_PURCHASES_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        for (int i = 2; i < max; i++) {
            Row r = STUDENTS_PURCHASES_SHEET.getRow(i);
            if (!cellIsNull0OrBlank(r.getCell(0))
                    && (int) r.getCell(1).getNumericCellValue() == id) {
                balance += r.getCell(2).getNumericCellValue();
            }
        }
        for (Item item : getItems()) {
            balance -= item.getPrice();
        }
        return balance;
    }

    public DefaultTableModel getBalanceAsTable() {
        final int columnCount = 5;
        final String[] headers = new String[columnCount];
        ArrayList<Object[]> data = new ArrayList<>();
        {
            Row r = STUDENTS_PURCHASES_SHEET.getRow(1);
            for (int i = 0; i < columnCount; i++) {
                headers[i] = r.getCell(i).getRichStringCellValue().toString();
            }
        }
        {
            Cell c = STUDENTS_PURCHASES_SHEET.getRow(0).getCell(1);
            int max = (int) c.getNumericCellValue() + 2;
            for (int i = 2; i < max; i++) {
                Row r = STUDENTS_PURCHASES_SHEET.getRow(i);
                if (!cellIsNull0OrBlank(r.getCell(0))
                        && (int) r.getCell(1).getNumericCellValue() == id) {
                    Object[] b_row = new Object[columnCount];
                    for (int j = 0; j < columnCount; j++) {
                        b_row[j] = r.getCell(j);
                    }
                    data.add(b_row);
                }
            }
        }
        {
            Cell c = STUDENTS_ITEMS_SHEET.getRow(0).getCell(1);
            int max = (int) c.getNumericCellValue() + 2;
            for (int i = 2; i < max; i++) {
                Row r = STUDENTS_ITEMS_SHEET.getRow(i);
                if (!cellIsNull0OrBlank(r.getCell(0))
                        && (int) r.getCell(1).getNumericCellValue() == id) {
                    Item item = new Item((int) r.getCell(2).getNumericCellValue());
                    data.add(new Object[]{r.getCell(0), r.getCell(1), -item.getPrice(),
                        r.getCell(3), item.getDescription()});
                }
            }
        }

        return new DefaultTableModel(data.toArray(new Object[data.size()][columnCount]), headers) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // for preventing any cell edit
                return false;
            }
        };
    }

    public DefaultTableModel getItemsAsTable() {
        return GUI_Util.buildTableModel(getItemsAsRows(), 4);
    }

    public DefaultComboBoxModel getItemsAsComboBox() {
        ArrayList<String> list = new ArrayList<>();
        getItems().forEach((item) -> list.add(item.getName() + COMBO_START
                + item.getId() + RIGHT_BRKT));
        return new DefaultComboBoxModel<>(list.toArray());
    }

    private ArrayList<Row> getItemsAsRows() {
        ArrayList<Row> rows = new ArrayList<>();
        Cell c = STUDENTS_ITEMS_SHEET.getRow(0).getCell(1);
        rows.add(STUDENTS_ITEMS_SHEET.getRow(1));
        int max = (int) c.getNumericCellValue() + 2;
        for (int i = 2; i < max; i++) {
            Row r = STUDENTS_ITEMS_SHEET.getRow(i);
            if (!cellIsNull0OrBlank(r.getCell(0))
                    && (int) r.getCell(1).getNumericCellValue() == id) {
                rows.add(r);
            }
        }
        return rows;
    }

    private ArrayList<Row> getPurchasesAsRows() {
        ArrayList<Row> rows = new ArrayList<>();
        Cell c = STUDENTS_PURCHASES_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        for (int i = 2; i < max; i++) {
            Row r = STUDENTS_PURCHASES_SHEET.getRow(i);
            if (!cellIsNull0OrBlank(r.getCell(0))
                    && (int) r.getCell(1).getNumericCellValue() == id) {
                rows.add(r);
            }
        }
        return rows;
    }

    public DefaultComboBoxModel getPurchasesAsComboBox() {
        ArrayList<String> list = new ArrayList<>();
        getPurchasesAsRows().forEach((r)
                -> list.add(r.getCell(2).getNumericCellValue() + COMBO_START
                        + r.getCell(0).getNumericCellValue() + RIGHT_BRKT));
        return new DefaultComboBoxModel<>(list.toArray());
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        Cell c = STUDENTS_ITEMS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        for (int i = 2; i < max; i++) {
            Row r = STUDENTS_ITEMS_SHEET.getRow(i);
            if (!cellIsNull0OrBlank(r.getCell(0))
                    && (int) r.getCell(1).getNumericCellValue() == id) {
                items.add(new Item((int) r.getCell(2).getNumericCellValue()));
            }
        }
        return items;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) throws IOException {
        this.row.getCell(14).setCellValue(image);
        updateSheet(STUDENTS_SHEET);
        this.image = image;
    }

    public void setCourse(int courseId) throws IOException {
        this.row.getCell(13).setCellValue(courseId);
        updateSheet(STUDENTS_SHEET);
        this.courseId = courseId;
    }

    public void delete() throws IOException {
        for (int i = 0; i < COLUMN_COUNT; i++) {
            this.row.getCell(i).setBlank();
        }
        this.row.setZeroHeight(true);
        updateSheet(STUDENTS_SHEET);
        this.firstName = null;
        this.fatherName = null;
        this.motherName = null;
        this.grandFatherName = null;
        this.lastName = null;
        this.birthDate = null;
        this.identitiyNumber = null;
        this.guardianName = null;
        this.guardianJob = null;
        this.guardianPhone = null;
        this.citizenOrRefugee = null;
        this.address = null;
        this.courseId = -3;

        getItemsAsRows().forEach((r) -> {
            for (int i = 0; i < 4; i++) {
                r.getCell(i).setBlank();
            }
        });
        updateSheet(STUDENTS_ITEMS_SHEET);

        getPurchasesAsRows().forEach((r) -> {
            for (int i = 0; i < 5; i++) {
                r.getCell(i).setBlank();
            }
        });
        updateSheet(STUDENTS_PURCHASES_SHEET);
    }

    public void addItem(int itemId) throws IOException {
        addItem(new Item(itemId));
    }

    public void addItem(Item i) throws IOException {
        Cell c = STUDENTS_ITEMS_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = STUDENTS_ITEMS_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1); //id
        CourseRow.createCell(1).setCellValue(id);
        CourseRow.createCell(2).setCellValue(i.getId());
        CourseRow.createCell(3).setCellValue(SIMPLE_DF.format(new Date()));
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(STUDENTS_ITEMS_SHEET);
    }

    public void removeItem(Item i) {
        removeItem(i.getId());
    }

    public void removeItem(int itemId) {
        ArrayList<Row> rows = getItemsAsRows();
        for (Row r : rows) {
            if ((int) r.getCell(2).getNumericCellValue() == itemId) {
                for (int i = 0; i < 4; i++) {
                    r.getCell(i).setBlank();
                }
                return;
            }
        }
        throw new IllegalArgumentException(REMOVE_ITEM_EXC_MSG);
    }

    public void addPurchase(double money, String description) throws IOException {
        Cell c = STUDENTS_PURCHASES_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = STUDENTS_PURCHASES_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1); //id
        CourseRow.createCell(1).setCellValue(id);
        CourseRow.createCell(2).setCellValue(money);
        CourseRow.createCell(3).setCellValue(SIMPLE_DF.format(new Date()));
        CourseRow.createCell(4).setCellValue(description);
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(STUDENTS_PURCHASES_SHEET);
    }

    public void removePurchase(int purchaseId) throws IOException {
        ArrayList<Row> rows = getPurchasesAsRows();
        for (Row r : rows) {
            if ((int) r.getCell(0).getNumericCellValue() == purchaseId) {
                for (int i = 0; i < 5; i++) {
                    r.getCell(i).setBlank();
                }
                updateSheet(STUDENTS_PURCHASES_SHEET);
                return;
            }
        }
        throw new IllegalArgumentException(REMOVE_ITEM_EXC_MSG);
    }

    public boolean isValid() {
        return !row.getZeroHeight();
    }
}
