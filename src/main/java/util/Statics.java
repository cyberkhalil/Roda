package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class Statics {

    public static final File RODA_PATH;
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

    private static void setUpFiles() {
        CurrentYearPath = new File(RODA_PATH, CurrentYear);
        STUDENTS_PATH = new File(CurrentYearPath, "Students");
        ITEMS_PATH = new File(CurrentYearPath, "Items");
        COURSES_PATH = new File(CurrentYearPath, "Courses");
        STUDENTS_ITEMS_PATH = new File(CurrentYearPath, "StudentItems");
        STUDENTS_PURCHASES_PATH = new File(CurrentYearPath, "StudentPurchases");
        STUDENTS_FILE = new File(STUDENTS_PATH, "Students.xls");
        ITEMS_FILE = new File(ITEMS_PATH, "Items.xls");
        COURSES_FILE = new File(COURSES_PATH, "Courses.xls");
        STUDENTS_ITEMS_FILE = new File(STUDENTS_ITEMS_PATH, "StudentsItems.xls");
        STUDENTS_PURCHASES_FILE = new File(STUDENTS_PURCHASES_PATH, "StudentPurchases.xls");

        PROGRAM_FOLDERS = new File[]{
            RODA_PATH, CurrentYearPath, STUDENTS_PATH, ITEMS_PATH, COURSES_PATH,
            STUDENTS_ITEMS_PATH, STUDENTS_PURCHASES_PATH
        };
        PROGRAM_FILES = new File[]{
            STUDENTS_FILE, ITEMS_FILE, COURSES_FILE, STUDENTS_ITEMS_FILE, STUDENTS_PURCHASES_FILE
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
            System.out.println(ex);
        }
    }

    public static String[] getAvailableYears() {
        if (RODA_PATH.list() == null || RODA_PATH.list().length == 0) {
            int Currentyear = Calendar.getInstance().get(Calendar.YEAR);
            return new String[]{Currentyear + "-" + (Currentyear + 1)};
        } else {
            return RODA_PATH.list();
        }
    }

    public static void RefreshAfterYearSelected() throws IOException {
        setUpFiles();
        PreRun.prepare();
        setUpSheets();
    }
}
