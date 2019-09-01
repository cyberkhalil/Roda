package util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class Statics {

    public static final File RODA_PATH;
    public static File IMAGES_PATH;
    public static String CurrentYear;
    public static File CurrentYearPath;
    public static File STUDENTS_PATH;
    public static File ITEMS_PATH;
    public static File COURSES_PATH;
    public static File STUDENTS_ITEMS_PATH;
    public static File STUDENTS_PURCHASES_PATH;
    public static File STUDENTS_FILE;
    public static File ITEMS_FILE;
    public static File COURSES_FILE;
    public static File STUDENTS_ITEMS_FILE;
    public static File STUDENTS_PURCHASES_FILE;
    public static File NULL_IMAGE_FILE;

    public static File[] PROGRAM_FOLDERS;
    public static File[] PROGRAM_FILES;
    public static File[] PROGRAM_SHEET_FILES;

    public static Sheet STUDENTS_SHEET;
    public static Sheet ITEMS_SHEET;
    public static Sheet COURSES_SHEET;
    public static Sheet STUDENTS_ITEMS_SHEET;
    public static Sheet STUDENTS_PURCHASES_SHEET;

    static {
        RODA_PATH = new File(System.getProperty("user.home") + "/.Roda");
        CurrentYear = getAvailableYears()[0];
        setUpFiles();
        if (PreRun.isPrepared()) {
            setUpSheets();
        }
    }

    private Statics() {
    }

    private static void setUpFiles() {
        CurrentYearPath = new File(RODA_PATH, CurrentYear);
        STUDENTS_PATH = new File(CurrentYearPath, "Students");
        ITEMS_PATH = new File(CurrentYearPath, "Items");
        COURSES_PATH = new File(CurrentYearPath, "Courses");
        IMAGES_PATH = new File(RODA_PATH, "Images");
        STUDENTS_ITEMS_PATH = new File(CurrentYearPath, "StudentItems");
        STUDENTS_PURCHASES_PATH = new File(CurrentYearPath, "StudentPurchases");
        STUDENTS_FILE = new File(STUDENTS_PATH, "Students.xls");
        ITEMS_FILE = new File(ITEMS_PATH, "Items.xls");
        COURSES_FILE = new File(COURSES_PATH, "Courses.xls");
        STUDENTS_ITEMS_FILE = new File(STUDENTS_ITEMS_PATH, "StudentsItems.xls");
        STUDENTS_PURCHASES_FILE = new File(STUDENTS_PURCHASES_PATH, "StudentPurchases.xls");
        NULL_IMAGE_FILE = new File(IMAGES_PATH, "null.jpg");

        PROGRAM_FOLDERS = new File[]{
            RODA_PATH, CurrentYearPath, STUDENTS_PATH, ITEMS_PATH, COURSES_PATH,
            IMAGES_PATH, STUDENTS_ITEMS_PATH, STUDENTS_PURCHASES_PATH
        };
        PROGRAM_FILES = new File[]{
            STUDENTS_FILE, ITEMS_FILE, COURSES_FILE, STUDENTS_ITEMS_FILE, STUDENTS_PURCHASES_FILE,
            NULL_IMAGE_FILE
        };
        PROGRAM_SHEET_FILES = new File[]{
            STUDENTS_FILE, ITEMS_FILE, COURSES_FILE, STUDENTS_ITEMS_FILE, STUDENTS_PURCHASES_FILE
        };
    }

    public static void setUpSheets() {
        try {
            STUDENTS_SHEET = new HSSFWorkbook(new FileInputStream(STUDENTS_FILE)).getSheetAt(0);
            ITEMS_SHEET = new HSSFWorkbook(new FileInputStream(ITEMS_FILE)).getSheetAt(0);
            COURSES_SHEET = new HSSFWorkbook(new FileInputStream(COURSES_FILE)).getSheetAt(0);
            STUDENTS_ITEMS_SHEET = new HSSFWorkbook(
                    new FileInputStream(STUDENTS_ITEMS_FILE)).getSheetAt(0);
            STUDENTS_PURCHASES_SHEET = new HSSFWorkbook(
                    new FileInputStream(STUDENTS_PURCHASES_FILE)).getSheetAt(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "خطأ في إعداد أوراق الإكسل !");
            System.err.println(ex);
        }
    }

    public static String[] getAvailableYears() {
        String[] list = RODA_PATH.list();
        if (list == null || list.length == 0) {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            return new String[]{currentYear + "-" + (currentYear + 1)};
        } else {
            return RODA_PATH.list();
        }
    }

    public static void RefreshAfterYearSelected() throws IOException {
        setUpFiles();
        PreRun.prepare();
        setUpSheets();
    }

    public static void updateSheet(Sheet s) throws IOException {
        FileOutputStream fos;
        if (s.equals(STUDENTS_SHEET)) {
            fos = new FileOutputStream(STUDENTS_FILE);
        } else if (s.equals(ITEMS_SHEET)) {
            fos = new FileOutputStream(ITEMS_FILE);
        } else if (s.equals(COURSES_SHEET)) {
            fos = new FileOutputStream(COURSES_FILE);
        } else if (s.equals(STUDENTS_ITEMS_SHEET)) {
            fos = new FileOutputStream(STUDENTS_ITEMS_FILE);
        } else if (s.equals(STUDENTS_PURCHASES_SHEET)) {
            fos = new FileOutputStream(STUDENTS_PURCHASES_FILE);
        } else {
            throw new IOException("لم يتم التعرف على الشيت");
        }
        s.getWorkbook().write(fos);
        fos.close();
    }

    public static boolean cellIsNull0OrBlank(Cell c) {
        if (c == null) {
            return true;
        }
        switch (c.getCellType()) {
            case BLANK:
                return true;
            case NUMERIC:
                return c.getNumericCellValue() == 0;
            case STRING:
                return c.getRichStringCellValue().getString().trim().isEmpty();
            default:
                return false;
        }
    }

    public static boolean stringBetweenBrackets(String s) {
        return s.startsWith("(") && s.endsWith(")");
    }

}
