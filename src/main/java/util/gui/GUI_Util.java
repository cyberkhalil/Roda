package util.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.Random;
import util.Statics;

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

    public static ImageIcon getImageIconFromCell(Cell cell) {
        return getImageIconFromCellString(cell.getStringCellValue());
    }

    public static ImageIcon getImageIconFromCellString(String s) {
        if (isImageCellString(s)) {
            String imgName = s.substring(5, s.length() - 1);
            return new ImageIcon(Statics.IMAGES_PATH + File.pathSeparator + imgName);
        }
        return new ImageIcon(Statics.NULL_IMAGE_FILE.toString());
    }

    public static String setImageIconAsStringToCell(String imgPath) throws IOException {
        File input = new File(imgPath);
        File output = new File(Statics.IMAGES_PATH, Random.generateRandomString(10) + ".jpg");
        BufferedImage image = ImageIO.read(input);
        BufferedImage outputImg = new BufferedImage(image.getWidth(), image.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        outputImg.createGraphics().drawImage(image, 0, 0, Color.WHITE, null);
        ImageIO.write(outputImg, "jpg", output);
        return "{img:" + output + "}";
    }

    public static boolean isImageCell(Cell c) {
        return isImageCellString(c.getRichStringCellValue().toString());
    }

    public static boolean isImageCellString(String s) {
        return s.startsWith("{img:") && s.endsWith("}");
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

    public static void link_2frames_to_button(JFrame frame1, JFrame frame2, JButton button) {
        button.setEnabled(false);
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                button.setEnabled(!frame2.isActive());
            }
        });
        frame2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                button.setEnabled(!frame1.isVisible());
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

    public static JFrame promoteComboBoxAndSpinner(String title, String comboLblTxt,
            ComboBoxModel comboBoxModel, String spinnerLblTxt, SpinnerNumberModel spinnerModel,
            String buttonTxt, DoSomethingWithComboBoxAndSpinner dswcbas) {
        JFrame promoteFrame = new PromoteComboBoxAndSpinner(title, comboLblTxt, comboBoxModel,
                spinnerLblTxt, spinnerModel, buttonTxt, dswcbas);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteComboBoxAndTwoOrSpinners(String title, String comboLblTxt,
            ComboBoxModel comboBoxModel, String spinner1LblTxt, SpinnerNumberModel spinner1Model,
            String spinner2LblTxt, SpinnerNumberModel spinner2Model, String toggleTextON,
            String toggleTextOFF, String buttonTxt,
            DoSomethingWithComboBoxAndTwoOrSpinners dswcbatos) {
        JFrame promoteFrame = new PromoteComboBoxAndTwoOrSpinners(title, comboLblTxt, comboBoxModel,
                spinner1LblTxt, spinner1Model, spinner2LblTxt, spinner2Model, toggleTextON,
                toggleTextOFF, buttonTxt, dswcbatos);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteTwoOrSpinners(String title, String spinner1LblTxt,
            SpinnerNumberModel spinner1Model, String spinner2LblTxt,
            SpinnerNumberModel spinner2Model, String toggleTextON, String toggleTextOFF,
            String buttonTxt, DoSomethingWithTwoOrSpinners dswtos) {
        JFrame promoteFrame = new PromoteTwoOrSpinners(
                title, spinner1LblTxt, spinner1Model, spinner2LblTxt, spinner2Model, toggleTextON,
                toggleTextOFF, buttonTxt, dswtos);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteDatePicker(String title, String labelTxt, String buttonTxt,
            DoSomethingWithDatePicker dswdp) {
        JFrame promoteFrame = new PromoteDatePicker(title, labelTxt, buttonTxt, dswdp);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteFormatedTextField(String title, String labelTxt, String format,
            String buttonTxt, DoSomethingWithFormatedTextField dswftf) {
        JFrame promoteFrame = new PromoteFormatedTextField(
                title, labelTxt, format, buttonTxt, dswftf);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame displayItemsInJTable(UpdateTableOperation uto) {
        JFrame displayFrame = new DisplayItemsInJTable(uto);
        displayFrame.setVisible(true);
        return displayFrame;
    }

    public static DisplayProgressBar displayProgressBar(String title, String labelTxt,
            UpdateProgressBarOperation upbo) {
        DisplayProgressBar frame = new DisplayProgressBar(title, labelTxt, upbo);
        frame.setVisible(true);
        return frame;
    }

    public static JFrame promoteDays(String title, String labelTxt, String buttonTxt,
            DoSomethingWithDays dswd) {
        JFrame promoteFrame = new PromoteDays(title, labelTxt, buttonTxt, dswd);
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static JFrame promoteDays(String title, String labelTxt, String buttonTxt,
            DoSomethingWithDays dswd, String defaultDays) {
        PromoteDays promoteFrame = new PromoteDays(title, labelTxt, buttonTxt, dswd);
        promoteFrame.daysCB1.setSelected(defaultDays.contains("Sa"));
        promoteFrame.daysCB2.setSelected(defaultDays.contains("Su"));
        promoteFrame.daysCB3.setSelected(defaultDays.contains("Mo"));
        promoteFrame.daysCB4.setSelected(defaultDays.contains("Tu"));
        promoteFrame.daysCB5.setSelected(defaultDays.contains("We"));
        promoteFrame.daysCB6.setSelected(defaultDays.contains("Th"));
        promoteFrame.daysCB7.setSelected(defaultDays.contains("Fr"));
        promoteFrame.setVisible(true);
        return promoteFrame;
    }

    public static void setUpRodaImgLbl(JLabel imgLbl) {
        imgLbl.setIcon(new ImageIcon(new ImageIcon(new GUI_Util().getClass().getClassLoader()
                .getResource("img/Roda.jpg")).getImage().getScaledInstance(imgLbl.getWidth(),
                imgLbl.getHeight(), Image.SCALE_DEFAULT)));
    }

    public static abstract interface DoSomethingWithSpinner {

        /**
         * @param spinnerValue the value of the spinner
         * @return true to close or false to not close
         */
        abstract boolean doSomething(double spinnerValue);
    }

    public static abstract interface DoSomethingWithComboBox {

        /**
         * @param choice
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String choice);
    }

    public static abstract interface DoSomethingWithDatePicker {

        /**
         * @param DateInMillis
         * @return true to close or false to not close
         */
        abstract boolean doSomething(long DateInMillis);
    }

    public static abstract interface DoSomethingWithFormatedTextField {

        /**
         * @param formatedText
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String formatedText);
    }

    public static abstract interface DoSomethingWithDays {

        /**
         *
         * @param days
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String days);
    }

    public static abstract interface DoSomethingWithComboBoxAndSpinner {

        /**
         *
         * @param choise
         * @param value
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String choise, double value);
    }

    public static abstract interface DoSomethingWithComboBoxAndTwoOrSpinners {

        /**
         *
         * @param choise
         * @param first
         * @param value
         * @return true to close or false to not close
         */
        abstract boolean doSomething(String choise, boolean first, double value);
    }

    public static abstract interface DoSomethingWithTwoOrSpinners {

        /**
         *
         * @param first
         * @param value
         * @return true to close or false to not close
         */
        abstract boolean doSomething(boolean first, double value);
    }

    public static abstract interface UpdateTableOperation {

        /**
         * @param table
         */
        abstract void updateTable(JTable table);
    }

    public static abstract interface UpdateProgressBarOperation {

        /**
         * @param progressBar
         * @param progressBarLabel
         * @return true to close or false to not close
         */
        abstract boolean updateBar(JProgressBar progressBar, JLabel progressBarLabel);
    }
}
