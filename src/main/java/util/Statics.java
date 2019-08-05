package util;

import java.io.File;

public class Statics {

    public static final File RODA_PATH = new File(System.getProperty("user.home") + "/.Roda");
    public static final File STUDENTS_PATH = new File(RODA_PATH, "Students");
    public static final File ITEMS_PATH = new File(RODA_PATH, "Items");
    public static final File COURSES_PATH = new File(RODA_PATH, "Courses");
    public static final File STUDENTS_FILE = new File(STUDENTS_PATH, "Students.xlsx");
    public static final File ITEMS_FILE = new File(ITEMS_PATH, "Items.xlsx");
    public static final File COURSES_FILE = new File(COURSES_PATH, "Courses.xlsx");

    public static final File[] PROGRAM_FOLIDERS = {
        RODA_PATH, STUDENTS_PATH, ITEMS_PATH, COURSES_PATH};
    public static final File[] PROGRAM_FILES = {STUDENTS_FILE, ITEMS_FILE, COURSES_FILE};

}
