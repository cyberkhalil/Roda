package util;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static util.Statics.*;

public class PreRun {

    private PreRun() {
    }

    public static void CheckAndPrepare() throws IOException {
        if (!isPrepared()) {
            if (JOptionPane.showConfirmDialog(
                    null, "هل تريد تثبيت البرنامج حقاً ؟") == JOptionPane.YES_OPTION) {
                prepare();
            } else {
                JOptionPane.showMessageDialog(null,
                        "آسف ولكن عليك أن تنصب البرنامج لتتمكن من استخدامه..");
                System.exit(0);
            }
        }
    }

    public static boolean isPrepared() {
        // check program folders existance
        for (File file : PROGRAM_FOLDERS) {
            if (!file.exists()) {
                return false;
            }
        }
        // check program files existance
        for (File file : PROGRAM_FILES) {
            if (!file.exists()) {
                return false;
            }
        }
        return true;
    }

    public static void prepare() throws IOException {
        // create non-existed folders
        for (File file : PROGRAM_FOLDERS) {
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        // create non-existed sheets
        for (File file : PROGRAM_SHEET_FILES) {
            if (!file.exists()) {
                Workbook wb = new HSSFWorkbook();
                Sheet sheet = wb.createSheet("sheet");
                try (OutputStream fileOut = new FileOutputStream(file)) {
                    Row row0 = sheet.createRow(0);
                    row0.createCell(0).setCellValue("العدد الكلي : ");
                    row0.createCell(1).setCellValue(0);
                    if (file == STUDENTS_FILE) {
                        Row row1 = sheet.createRow(1);
                        row1.createCell(0).setCellValue("رقم الطالب");
                        row1.createCell(1).setCellValue("اسم الطالب");
                        row1.createCell(2).setCellValue("اسم الأب");
                        row1.createCell(3).setCellValue("اسم الأم");
                        row1.createCell(4).setCellValue("اسم الجد");
                        row1.createCell(5).setCellValue("اسم العائلة");
                        row1.createCell(6).setCellValue("تاريخ الميلاد");
                        row1.createCell(7).setCellValue("رقم الهوية");
                        row1.createCell(8).setCellValue("اسم ولي الأمر");
                        row1.createCell(9).setCellValue("وظيفة ولي الأمر");
                        row1.createCell(10).setCellValue("رقم جوال أو هاتف ولي الأمر");
                        row1.createCell(11).setCellValue("مواطن أم لاجئ");
                        row1.createCell(12).setCellValue("العنوان");
                        row1.createCell(13).setCellValue("رقم الصف");
                        row1.createCell(14).setCellValue("الصورة");
                    } else if (file == Statics.COURSES_FILE) {
                        Row row1 = sheet.createRow(1);
                        row1.createCell(0).setCellValue("رقم الصف");
                        row1.createCell(1).setCellValue("اسم الصف");
                        row1.createCell(2).setCellValue("اسم المدرسة");
                        row1.createCell(3).setCellValue("السنة");
                    } else if (file == Statics.ITEMS_FILE) {
                        Row row1 = sheet.createRow(1);
                        row1.createCell(0).setCellValue("رقم العنصر");
                        row1.createCell(1).setCellValue("اسم العنصر");
                        row1.createCell(2).setCellValue("السعر");
                        row1.createCell(3).setCellValue("الوصف");
                    } else if (file == Statics.STUDENTS_ITEMS_FILE) {
                        Row row1 = sheet.createRow(1);
                        row1.createCell(0).setCellValue("رقم العملية");
                        row1.createCell(1).setCellValue("رقم الطالب");
                        row1.createCell(2).setCellValue("رقم العنصر");
                        row1.createCell(3).setCellValue("التاريخ");
                    } else if (file == Statics.STUDENTS_PURCHASES_FILE) {
                        Row row1 = sheet.createRow(1);
                        row1.createCell(0).setCellValue("رقم العملية");
                        row1.createCell(1).setCellValue("رقم الطالب");
                        row1.createCell(2).setCellValue("المبلغ");
                        row1.createCell(3).setCellValue("التاريخ");
                        row1.createCell(4).setCellValue("الوصف");
                    }
                    wb.write(fileOut);
                }
            }
        }
        // create non-existed files
        for (File file : PROGRAM_FILES) {
            if (!file.exists()) {
                if (file == Statics.NULL_IMAGE_FILE) {
                    FileUtils.copyURLToFile(
                            new PreRun().getClass().getResource("/img/null.jpg"), file);
                } else {
                    file.createNewFile();
                }
            }
        }
    }

}
