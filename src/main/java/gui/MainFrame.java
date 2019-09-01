package gui;

import com.alee.laf.WebLookAndFeel;
import com.alee.utils.FileUtils;
import gui.course.AddCourse;
import gui.course.EditCourses;
import gui.item.AddItem;
import gui.item.EditItems;
import gui.student.AddStudent;
import gui.student.EditStudents;
import util.PreRun;
import util.Statics;
import util.gui.GUI_Util;
import util.gui.JSystemFileChooser;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;

public class MainFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify
    protected javax.swing.JLabel contentTitleLbl;
    protected javax.swing.JPanel content_jPanel;
    protected javax.swing.JPanel coursesPnl;
    protected javax.swing.JPanel itemsPnl;
    protected javax.swing.JPanel studentsPnl;
    protected javax.swing.JPanel titlePnl;
    private javax.swing.JButton courseAddBtn;
    private javax.swing.JLabel coursesTitleLbl;
    private javax.swing.JButton editCoursesBtn;
    private javax.swing.JButton editStudentsBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton itemAddBtn;
    private javax.swing.JButton itemEdiBtn;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JButton printCoursesInfoBtn;
    private javax.swing.JButton printItemsInfoBtn;
    private javax.swing.JButton printStudentsInfoBtn;
    private javax.swing.JButton studentAddBtn;
    private javax.swing.JLabel studentTitleLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JComboBox<String> yearCB;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration

    public MainFrame() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        for (String availableYear : Statics.getAvailableYears()) {
            if (availableYear.equals(Statics.IMGS_TXT)) {
                continue;
            }
            yearCB.addItem(availableYear);
        }
        yearCB.setSelectedIndex(1);
    }

    public static void main(String args[]) {
        try {
            PreRun.CheckAndPrepare();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, Statics.PROGRAM_INSTALL_EXC_MSG);
            System.err.println(ex);
        }

        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, Statics.LOOK_AND_FEEL_EXC_MSG);
            System.err.println(ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        content_jPanel = new javax.swing.JPanel();
        studentsPnl = new javax.swing.JPanel();
        studentTitleLbl = new javax.swing.JLabel();
        studentAddBtn = new javax.swing.JButton();
        editStudentsBtn = new javax.swing.JButton();
        printStudentsInfoBtn = new javax.swing.JButton();
        itemsPnl = new javax.swing.JPanel();
        itemLbl = new javax.swing.JLabel();
        itemAddBtn = new javax.swing.JButton();
        itemEdiBtn = new javax.swing.JButton();
        printItemsInfoBtn = new javax.swing.JButton();
        contentTitleLbl = new javax.swing.JLabel();
        coursesPnl = new javax.swing.JPanel();
        coursesTitleLbl = new javax.swing.JLabel();
        courseAddBtn = new javax.swing.JButton();
        editCoursesBtn = new javax.swing.JButton();
        printCoursesInfoBtn = new javax.swing.JButton();
        yearCB = new javax.swing.JComboBox<>();
        yearLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getClassLoader().getResource("img/Roda.jpg")).getImage());
        setMinimumSize(null);
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setMaximumSize(new java.awt.Dimension(110, 110));
        imgLbl.setMinimumSize(new java.awt.Dimension(110, 110));
        imgLbl.setPreferredSize(new java.awt.Dimension(110, 110));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("روضة  الإبداع  التربوي");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setInheritsPopupMenu(false);

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
        );
        titlePnlLayout.setVerticalGroup(
                titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(titlePnlLayout.createSequentialGroup()
                                .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        content_jPanel.setBackground(new java.awt.Color(255, 255, 255));
        content_jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));

        studentsPnl.setBackground(new java.awt.Color(255, 255, 255));
        studentsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTitleLbl.setText("طلاب");
        studentTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentAddBtn.setText("إضافة طالب جديد");
        studentAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAddBtnActionPerformed(evt);
            }
        });

        editStudentsBtn.setText("تعديل بيانات الطلاب");
        editStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentsBtnActionPerformed(evt);
            }
        });

        printStudentsInfoBtn.setText("طباعة بيانات الطلاب");
        printStudentsInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStudentsInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsPnlLayout = new javax.swing.GroupLayout(studentsPnl);
        studentsPnl.setLayout(studentsPnlLayout);
        studentsPnlLayout.setHorizontalGroup(
                studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(studentsPnlLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(studentAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(printStudentsInfoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
        );
        studentsPnlLayout.setVerticalGroup(
                studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentsPnlLayout.createSequentialGroup()
                                .addComponent(studentTitleLbl)
                                .addGap(20, 20, 20)
                                .addComponent(studentAddBtn)
                                .addGap(15, 15, 15)
                                .addComponent(editStudentsBtn)
                                .addGap(15, 15, 15)
                                .addComponent(printStudentsInfoBtn)
                                .addGap(20, 20, 20))
        );

        itemsPnl.setBackground(new java.awt.Color(255, 255, 255));
        itemsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        itemLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        itemLbl.setForeground(new java.awt.Color(0, 51, 153));
        itemLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemLbl.setText("عناصر");
        itemLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        itemAddBtn.setText("إضافة عنصر جديد");
        itemAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddBtnActionPerformed(evt);
            }
        });

        itemEdiBtn.setText("تعديل بيانات العناصر");
        itemEdiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEdiBtnActionPerformed(evt);
            }
        });

        printItemsInfoBtn.setText("طباعة بيانات العناصر");
        printItemsInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printItemsInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsPnlLayout = new javax.swing.GroupLayout(itemsPnl);
        itemsPnl.setLayout(itemsPnlLayout);
        itemsPnlLayout.setHorizontalGroup(
                itemsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(itemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(itemsPnlLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(itemsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(printItemsInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(itemEdiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );
        itemsPnlLayout.setVerticalGroup(
                itemsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemsPnlLayout.createSequentialGroup()
                                .addComponent(itemLbl)
                                .addGap(20, 20, 20)
                                .addComponent(itemAddBtn)
                                .addGap(15, 15, 15)
                                .addComponent(itemEdiBtn)
                                .addGap(15, 15, 15)
                                .addComponent(printItemsInfoBtn)
                                .addGap(20, 20, 20))
        );

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("الصفحة الرئيسية");
        contentTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        coursesPnl.setBackground(new java.awt.Color(255, 255, 255));
        coursesPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        coursesTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        coursesTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        coursesTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coursesTitleLbl.setText("صفوف");
        coursesTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        courseAddBtn.setText("إضافة صف جديد");
        courseAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAddBtnActionPerformed(evt);
            }
        });

        editCoursesBtn.setText("تعديل بيانات الصفوف");
        editCoursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCoursesBtnActionPerformed(evt);
            }
        });

        printCoursesInfoBtn.setText("طباعة بيانات الصفوف");
        printCoursesInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printCoursesInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursesPnlLayout = new javax.swing.GroupLayout(coursesPnl);
        coursesPnl.setLayout(coursesPnlLayout);
        coursesPnlLayout.setHorizontalGroup(
                coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(coursesTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursesPnlLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(printCoursesInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editCoursesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );
        coursesPnlLayout.setVerticalGroup(
                coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coursesPnlLayout.createSequentialGroup()
                                .addComponent(coursesTitleLbl)
                                .addGap(20, 20, 20)
                                .addComponent(courseAddBtn)
                                .addGap(15, 15, 15)
                                .addComponent(editCoursesBtn)
                                .addGap(15, 15, 15)
                                .addComponent(printCoursesInfoBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        yearCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"إضافة سنة دراسية جديدة"}));
        yearCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearCBItemStateChanged(evt);
            }
        });

        yearLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearLbl.setForeground(new java.awt.Color(0, 51, 153));
        yearLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearLbl.setText("السنة الدراسية");

        javax.swing.GroupLayout content_jPanelLayout = new javax.swing.GroupLayout(content_jPanel);
        content_jPanel.setLayout(content_jPanelLayout);
        content_jPanelLayout.setHorizontalGroup(
                content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contentTitleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(content_jPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(itemsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(content_jPanelLayout.createSequentialGroup()
                                                .addComponent(yearLbl)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_jPanelLayout.createSequentialGroup()
                                                .addComponent(studentsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20))))
        );
        content_jPanelLayout.setVerticalGroup(
                content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_jPanelLayout.createSequentialGroup()
                                .addComponent(contentTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearLbl))
                                .addGap(18, 18, 18)
                                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(coursesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(itemsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(studentsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(content_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(content_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        content_jPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(
                rootPane, "هل أنت متأكد أنك تريد الخروج من البرنامج ؟", "تأكيد الخروج",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void printStudentsInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStudentsInfoBtnActionPerformed
        // TODO enchance and add more data to print
        JFileChooser f = new JSystemFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(rootPane);

        File selectedFolder = f.getSelectedFile();
        if (selectedFolder == null) {
            return;
        }
        for (File file : Statics.STUDENTS_PATH.listFiles()) {
            FileUtils.copyFile(file, new File(selectedFolder + "/" + file.getName()));
        }
    }//GEN-LAST:event_printStudentsInfoBtnActionPerformed

    private void printCoursesInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printCoursesInfoBtnActionPerformed
        // TODO enchance and add more data to print
        JFileChooser f = new JSystemFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(rootPane);

        File selectedFolder = f.getSelectedFile();
        if (selectedFolder == null) {
            return;
        }
        for (File file : Statics.COURSES_PATH.listFiles()) {
            FileUtils.copyFile(file, new File(selectedFolder + "/" + file.getName()));
        }
    }//GEN-LAST:event_printCoursesInfoBtnActionPerformed

    private void printItemsInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printItemsInfoBtnActionPerformed
        // TODO enchance and add more data to print
        JFileChooser f = new JSystemFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(rootPane);

        File selectedFolder = f.getSelectedFile();
        if (selectedFolder == null) {
            return;
        }
        for (File file : Statics.ITEMS_PATH.listFiles()) {
            FileUtils.copyFile(file, new File(selectedFolder + "/" + file.getName()));
        }
    }//GEN-LAST:event_printItemsInfoBtnActionPerformed

    private void yearCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearCBItemStateChanged
        if (evt.getStateChange() != ItemEvent.SELECTED) {
            return;
        }
        if (yearCB.getSelectedIndex() > 0) {
            Statics.CurrentYear = yearCB.getSelectedItem().toString();
        } else {
            String year = JOptionPane.showInputDialog(rootPane, "أدخل السنة الجديدة");
            if (year == null) {
                yearCB.setSelectedIndex(1);
                return;
            }
            year = year.trim();
            if (year.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NEW_YEAR_EXC_MSG);
                yearCB.setSelectedIndex(1);
            } else if (year.contains("/")) {
                JOptionPane.showMessageDialog(rootPane,
                        "السنة الجديدة لا يجب أن تحتوي على علامة (/)");
                yearCB.setSelectedIndex(1);
            } else {
                new File(Statics.RODA_PATH, year).mkdirs();
                yearCB.addItem(year);
                yearCB.setSelectedItem(year);
                Statics.CurrentYear = year;
            }
        }
        try {
            Statics.RefreshAfterYearSelected();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "هناك خطأ إنشاء في الملفات");
            System.err.println(ex);
        }
    }//GEN-LAST:event_yearCBItemStateChanged

    private void courseAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAddBtnActionPerformed
        AddCourse frame = new AddCourse();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, courseAddBtn);
    }//GEN-LAST:event_courseAddBtnActionPerformed

    private void editCoursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCoursesBtnActionPerformed
        EditCourses frame = new EditCourses();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, editCoursesBtn);
    }//GEN-LAST:event_editCoursesBtnActionPerformed

    private void itemAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddBtnActionPerformed
        AddItem frame = new AddItem();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, itemAddBtn);
    }//GEN-LAST:event_itemAddBtnActionPerformed

    private void itemEdiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEdiBtnActionPerformed
        EditItems frame = new EditItems();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, itemEdiBtn);
    }//GEN-LAST:event_itemEdiBtnActionPerformed

    private void studentAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAddBtnActionPerformed
        AddStudent frame = new AddStudent();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, studentAddBtn);
    }//GEN-LAST:event_studentAddBtnActionPerformed

    private void editStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentsBtnActionPerformed
        EditStudents frame = new EditStudents();
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, editStudentsBtn);
    }//GEN-LAST:event_editStudentsBtnActionPerformed

}
