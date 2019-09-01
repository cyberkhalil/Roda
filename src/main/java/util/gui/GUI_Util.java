package util.gui;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import util.Random;
import util.Statics;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GUI_Util {

    public static DefaultTableModel buildTableModel(ArrayList<Row> rows, int columnCount) {
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = rows.get(0).getCell(i).getRichStringCellValue().getString();
        }
        ArrayList<Object[]> data = new ArrayList<>(rows.size() - 1);
        for (int i = 1; i < rows.size(); i++) {
            Object[] row = new Object[columnCount];
            for (int j = 0; j < columnCount; j++) {
                row[j] = rows.get(i).getCell(j);
            }
            data.add(row);
        }
        return new DefaultTableModel(
                data.toArray(new Object[data.size()][columnCount]), columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // for preventing any cell edit
                return false;
            }
        };
    }

    public static DefaultComboBoxModel buildComboBoxModel(ArrayList<Row> rows, int idColumnNumber,
            int nameColumnNumber) {
        String[] options = new String[rows.size()];
        for (int i = 1; i < rows.size(); i++) {
            options[i - 1]
                    = rows.get(i).getCell(nameColumnNumber).getRichStringCellValue().getString()
                    + " (id=" + (int) rows.get(i).getCell(idColumnNumber).getNumericCellValue()
                    + ")";
        }
        return new DefaultComboBoxModel<>(options);
    }

    public static void writeToExcell(JTable table, String path)
            throws IOException {
        Workbook wb = new XSSFWorkbook(); //Excell workbook
        Sheet sheet = wb.createSheet(); //WorkSheet
        Row row = sheet.createRow(2); //Row created at line 3
        TableModel model = table.getModel(); //Table model

        Row headerRow = sheet.createRow(0); //Create row at line 0
        for (int headings = 0; headings < model.getColumnCount(); headings++) { //For each column
            //Write column name
            headerRow.createCell(headings).setCellValue(model.getColumnName(headings));
        }

        for (int rows = 0; rows < model.getRowCount(); rows++) { //For each table row
            for (int cols = 0; cols < table.getColumnCount(); cols++) { //For each table column
                //Write value
                row.createCell(cols).setCellValue(model.getValueAt(rows, cols).toString());
            }

            //Set the row to the next one in the sequence 
            row = sheet.createRow((rows + 3));
        }
        if (path.endsWith(".xlc")) {
            wb.write(new FileOutputStream(path));//Save the file     
        } else {
            wb.write(new FileOutputStream(path + ".xlc"));//Save the file     
        }
    }

    public static String parseIdFromComboBoxOption(String option) {
        if (option == null || option.trim().isEmpty() || !option.contains("(")
                || !option.contains(")")) {
            return "0";
        }
        int i1 = option.lastIndexOf("(") + 3;// 3 = "id=".length()
        int i2 = option.lastIndexOf(")");
        if (i2 < i1) {
            return "0";
        }
        return option.substring(i1 + 1, i2);
    }

    public static ImageIcon getImageIconFromCellString(String s) {
        if (isImageCellString(s)) {
            String imgName = s.substring(5, s.length() - 1);
            return new ImageIcon(imgName);
        }
        return new ImageIcon(Statics.NULL_IMAGE_FILE.toString());
    }

    public static String setImageIconAsStringToCell(String imgPath) throws IOException {
        File input = new File(imgPath);
        File output;
        if (!input.exists()) {
            output = Statics.NULL_IMAGE_FILE;
        } else {
            output = new File(Statics.IMAGES_PATH, Random.generateRandomString(10) + ".jpg");
            BufferedImage image = ImageIO.read(input);
            BufferedImage outputImg = new BufferedImage(image.getWidth(), image.getHeight(),
                    BufferedImage.TYPE_INT_RGB);
            outputImg.createGraphics().drawImage(image, 0, 0, Color.WHITE, null);
            ImageIO.write(outputImg, "jpg", output);
        }
        return "{img:" + output + "}";
    }

    public static boolean isImageCellString(String s) {
        return s.startsWith("{img:") && s.endsWith("}");
    }

    public static boolean TextBetweenBrackets(JTextComponent tc) {
        return Statics.stringBetweenBrackets(tc.getText());
    }

    public static String getTextOrEmpty(JTextComponent tc) {
        if (tc.getText() == null || Statics.stringBetweenBrackets(tc.getText())) {
            return "";
        } else {
            return tc.getText();
        }
    }

    public static boolean AnyTextBetweenBrackets(JTextComponent... tc) {
        for (JTextComponent jTextComponent : tc) {
            if (Statics.stringBetweenBrackets(jTextComponent.getText())) {
                return true;
            }
        }
        return false;
    }

    public static void removeTextOnFocusGained(JTextComponent tc) {
        if (TextBetweenBrackets(tc)) {
            tc.setText("");
        }
    }

    public static void setTextOnFocusLost(JTextComponent tc, String text) {
        if (tc.getText().isEmpty()) {
            tc.setText(text);
        }
    }

    public static void link_frame_to_button(JFrame frame, JButton button) {
        button.setEnabled(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                button.setEnabled(true);
            }
        });
    }

    public static JFrame promoteSpinner(String title, String label,
            SpinnerNumberModel spinnerNumberModel, String button, DoSomethingWithSpinner dsws) {
        JFrame promoteFrame = new PromoteSpinner(title, label, spinnerNumberModel, button, dsws);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteComboBox(String title, String labelTxt, String buttonTxt,
            ComboBoxModel comboBoxModel, DoSomethingWithComboBox dswcb) {
        JFrame promoteFrame = new PromoteComboBox(title, labelTxt, comboBoxModel, buttonTxt, dswcb);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteComboBoxAndSpinner(String title, String textAreaLblTxt,
            String spinnerLblTxt, SpinnerNumberModel spinnerModel, String buttonTxt,
            DoSomethingWithTextAndSpinner dswcbas) {
        JFrame promoteFrame = new PromoteTextAreaAndSpinner(title, textAreaLblTxt,
                spinnerLblTxt, spinnerModel, buttonTxt, dswcbas);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteDatePicker(String title, String labelTxt, String buttonTxt,
            DoSomethingWithDatePicker dswdp) {
        JFrame promoteFrame = new PromoteDatePicker(title, labelTxt, buttonTxt, dswdp);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame displayItemsInJTable(UpdateTableOperation uto) {
        JFrame displayFrame = new DisplayItemsInJTable(uto);
        displayFrame.setVisible(true);
        return displayFrame;
    }

    public static void setUpRodaImgLbl(JLabel imgLbl) {
        imgLbl.setIcon(setImageIconToLabelSize(
                new ImageIcon(
                        new GUI_Util().getClass().getClassLoader().getResource("img/Roda.jpg")),
                imgLbl));
    }

    public static Image setImageToSize(Image i, int width, int heigth) {
        return i.getScaledInstance(width, heigth, Image.SCALE_DEFAULT);
    }

    public static ImageIcon setImageIconToLabelSize(ImageIcon ic, JLabel lbl) {
        return new ImageIcon(setImageToSize(ic.getImage(), lbl.getWidth(), lbl.getHeight()));
    }

    public static ImageIcon setImageIconToSize(ImageIcon ic, int width, int height) {
        return new ImageIcon(setImageToSize(ic.getImage(), width, height));
    }

    public interface DoSomethingWithSpinner {

        /**
         * @param spinnerValue the value of the spinner
         * @return true to close or false to not close
         */
        boolean doSomething(double spinnerValue);
    }

    public interface DoSomethingWithComboBox {

        /**
         * @param choice
         * @return true to close or false to not close
         */
        boolean doSomething(String choice);
    }

    public interface DoSomethingWithDatePicker {

        /**
         * @param DateInMillis
         * @return true to close or false to not close
         */
        boolean doSomething(long DateInMillis);
    }

    public interface DoSomethingWithTextAndSpinner {

        /**
         * @param text
         * @param value
         * @return true to close or false to not close
         */
        boolean doSomething(String text, double value);
    }

    public interface UpdateTableOperation {

        /**
         * @param table
         */
        void updateTable(JTable table);
    }
}
