package core.item;

import core.student.Student;
import core.student.StudentsUtil;
import org.apache.poi.ss.usermodel.Row;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

import static util.Statics.ITEMS_SHEET;
import static util.Statics.updateSheet;

public class Item {

    final static int COLUMN_COUNT = 4;
    private final int id;
    private final Row row;
    private String name;
    private double price;
    private String description;

    public Item(int id) {
        this.row = ITEMS_SHEET.getRow(id + 1);
        this.id = (int) row.getCell(0).getNumericCellValue();
        this.name = row.getCell(1).getRichStringCellValue().getString();
        this.price = row.getCell(2).getNumericCellValue();
        this.description = row.getCell(3).getRichStringCellValue().getString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        this.row.getCell(1).setCellValue(name);
        updateSheet(ITEMS_SHEET);
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IOException {
        this.row.getCell(2).setCellValue(price);
        updateSheet(ITEMS_SHEET);
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IOException {
        this.row.getCell(3).setCellValue(description);
        updateSheet(ITEMS_SHEET);
        this.description = description;
    }

    public void renderStudentsToTable(JTable table) {
        table.setModel(StudentsUtil.getStudentsAsTable(getStudents()));
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> itemStudents = new ArrayList<>();
        StudentsUtil.getStudents().stream().filter(
                (s) -> (s.getItems().contains(this))).forEachOrdered(itemStudents::add);
        return itemStudents;
    }

    public void delete() throws IOException {
        for (int i = 0; i < COLUMN_COUNT; i++) {
            this.row.getCell(i).setBlank();
        }
        this.row.setZeroHeight(true);
        updateSheet(ITEMS_SHEET);
        this.name = null;
        this.description = null;
        this.price = -1;
        StudentsUtil.getStudents().stream().filter((s) -> (s.getItems().contains(this)))
                .forEachOrdered((s) -> s.removeItem(this));
    }

}
