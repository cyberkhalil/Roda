package core.student;

import core.course.Course;
import java.io.IOException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.STUDENTS_SHEET;
import static util.Statics.updateSheet;

public class Student {

    private final int id;
    private String firstName;
    private String fatherName;
    private String motherName;
    private String grandFatherName;
    private String lastName;
    private Date birthDate;
    private String identitiyNumber;
    private String guardianName;
    private String guardianJob;
    private String guardianPhone;
    private String citizenOrRefugee;
    private String address;
    private int courseId;
    private String image;

    private final Row row;
    public final static int COLUMN_COUNT = 15;

    public Student(int id) {
        this.row = STUDENTS_SHEET.getRow(id + 1);
        this.id = (int) row.getCell(0).getNumericCellValue();
        this.firstName = row.getCell(1).getRichStringCellValue().getString();
        this.fatherName = row.getCell(2).getRichStringCellValue().getString();
        this.motherName = row.getCell(3).getRichStringCellValue().getString();
        this.grandFatherName = row.getCell(4).getRichStringCellValue().getString();
        this.lastName = row.getCell(5).getRichStringCellValue().getString();
        this.birthDate = row.getCell(6).getDateCellValue();
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

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getGrandFatherName() {
        return grandFatherName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + fatherName + " " + grandFatherName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getIdentitiyNumber() {
        return identitiyNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public String getGuardianJob() {
        return guardianJob;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public String getCitizenOrRefugee() {
        return citizenOrRefugee;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is still not supported");
    }

    public DefaultTableModel getBalanceAsTable() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is not supported yet");
    }

    public DefaultTableModel getItemAsTable() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is not supported yet");
    }

    public String getTeacherName() {
        return new Course(courseId).getTeacherName();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getImage() {
        return image;
    }

    public void setFirstName(String firstName) throws IOException {
        this.row.getCell(1).setCellValue(firstName);
        updateSheet(STUDENTS_SHEET);
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) throws IOException {
        this.row.getCell(2).setCellValue(fatherName);
        updateSheet(STUDENTS_SHEET);
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) throws IOException {
        this.row.getCell(3).setCellValue(motherName);
        updateSheet(STUDENTS_SHEET);
        this.motherName = motherName;
    }

    public void setGrandFatherName(String grandFatherName) throws IOException {
        this.row.getCell(4).setCellValue(grandFatherName);
        updateSheet(STUDENTS_SHEET);
        this.grandFatherName = grandFatherName;
    }

    public void setLastName(String lastName) throws IOException {
        this.row.getCell(5).setCellValue(lastName);
        updateSheet(STUDENTS_SHEET);
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) throws IOException {
        this.row.getCell(6).setCellValue(birthDate);
        updateSheet(STUDENTS_SHEET);
        this.birthDate = birthDate;
    }

    public void setIdentitiyNumber(String identitiyNumber) throws IOException {
        this.row.getCell(7).setCellValue(identitiyNumber);
        updateSheet(STUDENTS_SHEET);
        this.identitiyNumber = identitiyNumber;
    }

    public void setGuardianName(String guardianName) throws IOException {
        this.row.getCell(8).setCellValue(guardianName);
        updateSheet(STUDENTS_SHEET);
        this.guardianName = guardianName;
    }

    public void setGuardianJob(String guardianJob) throws IOException {
        this.row.getCell(9).setCellValue(guardianJob);
        updateSheet(STUDENTS_SHEET);
        this.guardianJob = guardianJob;
    }

    public void setGuardianPhone(String guardianPhone) throws IOException {
        this.row.getCell(10).setCellValue(guardianPhone);
        updateSheet(STUDENTS_SHEET);
        this.guardianPhone = guardianPhone;
    }

    public void setCitizenOrRefugee(String citizenOrRefugee) throws IOException {
        this.row.getCell(11).setCellValue(citizenOrRefugee);
        updateSheet(STUDENTS_SHEET);
        this.citizenOrRefugee = citizenOrRefugee;
    }

    public void setAddress(String address) throws IOException {
        this.row.getCell(12).setCellValue(address);
        updateSheet(STUDENTS_SHEET);
        this.address = address;
    }

    public void setCourse(Course c) throws IOException {
        this.row.getCell(13).setCellValue(c.getId());
        updateSheet(STUDENTS_SHEET);
        this.courseId = c.getId();
    }

    public void setCourse(int courseId) throws IOException {
        this.row.getCell(13).setCellValue(courseId);
        updateSheet(STUDENTS_SHEET);
        this.courseId = courseId;
    }

    public void setImage(String image) throws IOException {
        this.row.getCell(14).setCellValue(image);
        updateSheet(STUDENTS_SHEET);
        this.image = image;
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
        // TODO also remove from StudentItems, StudentPurchases
    }

    public void addItem(core.item.Item i) {
        // TODO implement this
    }

}
