package util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Statics {

    public static final String SPACE = " ";
    public static final String THE_TXT = "ال";
    public static final String NO_TXT = "لا";
    public static final String TO_TXT = "أن";
    public static final String CAN_TXT = "يمكن";
    public static final String BE_TXT = "يكون";
    public static final String BEE_TXT = "تكون";
    public static final String EMPTY_TXT = "فارغاً";
    public static final String EMPTYY_TXT = "فارغة";
    public static final String NUMBER_TXT = "رقم";
    public static final String IDENTITY_TXT = "هوية";
    public static final String DESC_TXT = "وصف";
    public static final String NAME_TXT = "اسم";
    public static final String JOB_TXT = "وظيفة";
    public static final String BOSTAN_TXT = "بستان";
    public static final String TAMHEDY_TXT = "تمهيدي";
    public static final String AGE_TXT = "سن";
    public static final String YEAR_TXT = "سنة";
    public static final String ADDRESS_TXT = "عنوان";
    public static final String STUDENT_TXT = "طالب";
    public static final String DEFERENT_TXT = "مختلف";
    public static final String PHONE_TXT = "(الهاتف/الجوال)";
    public static final String PHONE_OR_MOB_NUMB_TXT = "جوال أو هاتف";
    public static final String DATE_FORMAT_TXT = "YYYY-MM-dd";
    public static final String COMBO_START = " (id=";
    public static final String RIGHT_BRKT = ")";
    public static final String IMGS_TXT = "Images";

    public static final String THE_YEAR_TXT = THE_TXT + YEAR_TXT;
    public static final String CANNOT_TXT = NO_TXT + SPACE + CAN_TXT; // لا يمكن
    public static final String TO_BE_TXT = TO_TXT + SPACE + BE_TXT; // أن يكون
    public static final String TO_BEE_TXT = TO_TXT + SPACE + BEE_TXT; // أن تكون
    public static final String ANOTHER_AGE_TXT = AGE_TXT + SPACE + DEFERENT_TXT;// سن مختلف
    public static final String THE_NAME_TXT = THE_TXT + NAME_TXT;//الاسم
    public static final String THE_STUDENT_TXT = THE_TXT + STUDENT_TXT;//الطالب
    public static final String THE_DESC_TXT = THE_TXT + DESC_TXT;//الوصف
    public static final String THE_NUMBER_TXT = THE_TXT + NUMBER_TXT;//الرقم
    public static final String THE_IDENTITY_TXT = THE_TXT + IDENTITY_TXT;//الهوية
    public static final String THE_JOB_TXT = THE_TXT + JOB_TXT;//الوظيفة
    public static final String JOB_NAME_TXT = NAME_TXT + SPACE + THE_JOB_TXT;//اسم الوظيفة
    public static final String STUDENT_NAME_TXT = NAME_TXT + SPACE + THE_STUDENT_TXT;//اسم الطالب
    public static final String THE_ADDRESS_TXT = THE_TXT + ADDRESS_TXT;
    public static final String THE_NEW_YEAR_TXT = "السنة الجديد";
    public static final String PHONE_NUMBER_TXT = NUMBER_TXT + SPACE + PHONE_TXT;// رقم الهاتف
    public static final String IDENTITY_NUMBER_TXT = NUMBER_TXT + SPACE + THE_IDENTITY_TXT;// رقم الهوية
    public static final String CANNOT_BE_TXT = CANNOT_TXT + SPACE + TO_BE_TXT; // لا يمكن أن يكون
    public static final String CANNOT_BEE_TXT = CANNOT_TXT + SPACE + TO_BEE_TXT; // لا يمكن أن يكون
    public static final String EMPTY_NAME_EXC_MSG = CANNOT_BE_TXT + SPACE + THE_NAME_TXT
            + SPACE + EMPTY_TXT; // لا يمكن أن يكون الاسم فارغا
    public static final String EMPTY_ADDRESS_EXC_MSG = CANNOT_BE_TXT + SPACE + THE_ADDRESS_TXT
            + SPACE + EMPTY_TXT; // لا يمكن أن يكون العنوان فارغا
    public static final String EMPTY_NEW_YEAR_EXC_MSG = CANNOT_BEE_TXT + SPACE + THE_NEW_YEAR_TXT
            + SPACE + EMPTYY_TXT; // لا يمكن أن يكون السنة الجديدة فارغة
    public static final String EMPTY_JOB_NAME_EXC_MSG = CANNOT_TXT + SPACE + TO_BE_TXT + SPACE
            + JOB_NAME_TXT + SPACE + EMPTY_TXT; // لا يمكن أن يكون اسم الوظيفة فارغا
    public static final String EMPTY_PHONE_EXC_MSG = CANNOT_TXT + SPACE + TO_BE_TXT
            + PHONE_NUMBER_TXT + SPACE + EMPTY_TXT; // لا يمكن أن يكون رقم الهاتف فارغا
    public static final String EMPTY_IDENTITY_EXC_MSG = CANNOT_TXT + SPACE + TO_BE_TXT
            + IDENTITY_NUMBER_TXT + SPACE + EMPTY_TXT; // لا يمكن أن يكون رقم الهوية فارغا
    public static final String EMPTY_DESC_EXC_MSG = Statics.CANNOT_BE_TXT + Statics.SPACE
            + THE_DESC_TXT + Statics.SPACE + Statics.EMPTY_TXT; // لا يمكن أن يكون الوصف فارغا
    public static final String LOOK_AND_FEEL_EXC_MSG = CANNOT_TXT + SPACE
            + "تشغيل ميزة الظهور بشكل مناسب";// لا يمكن تشغيل ميزة الظهور بشكل مناسب
    public static final String REMOVE_ITEM_EXC_MSG = CANNOT_TXT + SPACE
            + "حذف عنصر من طالب لا يمتلكه";//لا يمكنك حذف عنصر من طالب لا يمتلكه
    public static final String PROGRAM_INSTALL_EXC_MSG = "حدث خطأ أثناء تنصيب البرنامج ,"
            + "الرجاء المحاولة من الجديد";// حدث خطأ أثناء تنصيب البرنامج الرجاء المحاولة من جديد

    public static final SimpleDateFormat SIMPLE_DF = new SimpleDateFormat(DATE_FORMAT_TXT);

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
                return getStringFromCell(c).trim().isEmpty();
            default:
                return false;
        }
    }

    public static boolean stringBetweenBrackets(String s) {
        return s.startsWith("(") && s.endsWith(")");
    }

    public static String getStringFromCell(Cell c) {
        try {
            return c.getRichStringCellValue().getString();
        } catch (Exception ex) {
            return "";
        }
    }

}
