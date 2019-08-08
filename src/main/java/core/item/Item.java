package core.item;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.ITEMS_SHEET;
import static util.Statics.updateSheet;

public class Item {

    private int id;
    private String name;
    private double price;
    private String description;

    private final Row row;
    public final static int COLUMN_COUNT = 4;

    public Item(int id) {
        // TODO implement this constractor
        throw new UnsupportedOperationException("This operation is still not supported");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public DefaultTableModel getStudentsAsTable() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is not supported yet");
    }

    public DefaultTableModel getBoughtAsTable() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is not supported yet");
    }

    public int getStudentsNumber() {
        // TODO implement this method
        throw new UnsupportedOperationException("This operation is not supported yet");
    }

    public void setName(String name) throws IOException {
        this.row.getCell(1).setCellValue(name);
        updateSheet(ITEMS_SHEET);
        this.name = name;
    }

    public void setPrice(double price) throws IOException {
        this.row.getCell(2).setCellValue(price);
        updateSheet(ITEMS_SHEET);
        this.price = price;
    }

    public void setDescription(String description) throws IOException {
        this.row.getCell(3).setCellValue(description);
        updateSheet(ITEMS_SHEET);
        this.description = description;
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
        // TODO remove from StudentItems
    }

    public boolean isValid() {
        return !row.getZeroHeight();
    }
}
