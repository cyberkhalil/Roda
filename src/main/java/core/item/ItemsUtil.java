package core.item;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import static util.Statics.ITEMS_SHEET;
import static util.Statics.cellIsNull0OrBlank;
import static util.Statics.updateSheet;
import util.gui.GUI_Util;

public class ItemsUtil {

    public static void createItem(String name, double price, String description)
            throws IOException {
        Cell c = ITEMS_SHEET.getRow(0).getCell(1);
        int preValue = (int) c.getNumericCellValue();
        int max = preValue + 2;
        Row CourseRow = ITEMS_SHEET.createRow(max);
        CourseRow.createCell(0).setCellValue(preValue + 1);
        CourseRow.createCell(1).setCellValue(name);
        CourseRow.createCell(2).setCellValue(price);
        CourseRow.createCell(3).setCellValue(description);
        c.setCellValue(preValue + 1); // max value will get addition 1
        updateSheet(ITEMS_SHEET);
    }

    public static DefaultTableModel getItemsAsTable() {
        return GUI_Util.buildTableModel(getItemsRows(), Item.COLUMN_COUNT);
    }

    public static DefaultComboBoxModel getItemsAsComboBox() {
        return GUI_Util.buildComboBoxModel(getItemsRows(), 0, 1);
    }

    private static ArrayList<Row> getItemsRows() {
        Cell c = ITEMS_SHEET.getRow(0).getCell(1);
        int max = (int) c.getNumericCellValue() + 2;
        ArrayList<Row> rows = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            Row row = ITEMS_SHEET.getRow(i);
            if (cellIsNull0OrBlank(row.getCell(0))) {
                continue;
            }
            rows.add(row);
        }
        return rows;
    }

    private ItemsUtil() {
    }

}
