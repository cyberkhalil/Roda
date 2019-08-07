package util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Statics {

    public static final File RODA_PATH = new File(System.getProperty("user.home") + "/.Roda");
    public static String CurrentYear;
    public static File CurrentYearPath;
    public static File STUDENTS_PATH;
    public static File ITEMS_PATH;
    public static File COURSES_PATH;
    public static File STUDENTS_COURSES_PATH;
    public static File STUDENTS_ITEMS_PATH;
    public static File STUDENTS_FILE;
    public static File ITEMS_FILE;
    public static File COURSES_FILE;
    public static File STUDENTS_COURSES_FILE;
    public static File STUDENTS_ITEMS_FILE;

    public static File[] PROGRAM_FOLIDERS;
    public static File[] PROGRAM_FILES;

    private static void setUpFiles() {
        CurrentYear = getAvailableYears()[0];
        CurrentYearPath = new File(RODA_PATH, CurrentYear);
        STUDENTS_PATH = new File(CurrentYearPath, "Students");
        ITEMS_PATH = new File(CurrentYearPath, "Items");
        COURSES_PATH = new File(CurrentYearPath, "Courses");
        STUDENTS_COURSES_PATH = new File(CurrentYearPath, "StudentCourses");
        STUDENTS_ITEMS_PATH = new File(CurrentYearPath, "StudentItems");
        STUDENTS_FILE = new File(STUDENTS_PATH, "Students.xlsx");
        ITEMS_FILE = new File(ITEMS_PATH, "Items.xlsx");
        COURSES_FILE = new File(COURSES_PATH, "Courses.xlsx");
        STUDENTS_COURSES_FILE = new File(STUDENTS_COURSES_PATH, "StudentsCourses.xlsx");
        STUDENTS_ITEMS_FILE = new File(STUDENTS_ITEMS_PATH, "StudentsItems.xlsx");

        PROGRAM_FOLIDERS = new File[]{
            RODA_PATH, CurrentYearPath, STUDENTS_PATH, ITEMS_PATH, COURSES_PATH,
            STUDENTS_COURSES_PATH, STUDENTS_ITEMS_PATH
        };
        PROGRAM_FILES = new File[]{
            STUDENTS_FILE, ITEMS_FILE, COURSES_FILE, STUDENTS_COURSES_FILE, STUDENTS_ITEMS_FILE
        };
    }

    static {
        setUpFiles();
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
    }
}
