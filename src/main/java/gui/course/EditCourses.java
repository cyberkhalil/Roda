package gui.course;

import core.course.Course;
import core.course.CoursesUtil;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import util.gui.GUI_Util;

public class EditCourses extends javax.swing.JFrame {

    private Course selectedCourse;

    public EditCourses() {
        initComponents();
        setUpImg();
        try {
            this.coursesTbl.setModel(CoursesUtil.getCoursesAsTable());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء إظهار الصفوف !");
            System.err.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursesSPnl = new javax.swing.JScrollPane();
        coursesTbl = new javax.swing.JTable();
        courseDataPnl = new javax.swing.JPanel();
        courseIdTf = new javax.swing.JTextField();
        courseNameTf = new javax.swing.JTextField();
        courseTeacherTf = new javax.swing.JTextField();
        courseYearTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        courseButtonsPnl = new javax.swing.JPanel();
        setName = new javax.swing.JButton();
        setTeacherName = new javax.swing.JButton();
        setYear = new javax.swing.JButton();
        displayCourseStudents = new javax.swing.JButton();
        deleteCourseBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        coursesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        coursesTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        coursesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTblMouseClicked(evt);
            }
        });
        coursesSPnl.setViewportView(coursesTbl);

        courseDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        courseIdTf.setEditable(false);
        courseIdTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        courseNameTf.setEditable(false);
        courseNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        courseTeacherTf.setEditable(false);
        courseTeacherTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        courseYearTf.setEditable(false);
        courseYearTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("رقم الصف :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("اسم الصف :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم المدرسة :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("السن :");

        javax.swing.GroupLayout courseDataPnlLayout = new javax.swing.GroupLayout(courseDataPnl);
        courseDataPnl.setLayout(courseDataPnlLayout);
        courseDataPnlLayout.setHorizontalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(courseTeacherTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseIdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(courseYearTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        courseDataPnlLayout.setVerticalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseTeacherTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseYearTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        courseButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        courseButtonsPnl.setAlignmentX(0.0F);
        courseButtonsPnl.setAlignmentY(0.0F);

        setName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setName.setText("تعديل اسم الصف");
        setName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameActionPerformed(evt);
            }
        });

        setTeacherName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setTeacherName.setText("تعديل اسم المدرسة");
        setTeacherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTeacherNameActionPerformed(evt);
            }
        });

        setYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setYear.setText("تعديل السن");
        setYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setYearActionPerformed(evt);
            }
        });

        displayCourseStudents.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayCourseStudents.setText("إظهار طلاب الصف");
        displayCourseStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCourseStudentsActionPerformed(evt);
            }
        });

        deleteCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteCourseBtn.setText("حذف الصف");
        deleteCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout courseButtonsPnlLayout = new javax.swing.GroupLayout(courseButtonsPnl);
        courseButtonsPnl.setLayout(courseButtonsPnlLayout);
        courseButtonsPnlLayout.setHorizontalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setTeacherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayCourseStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setYear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        courseButtonsPnlLayout.setVerticalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setTeacherName)
                    .addComponent(setName))
                .addGap(15, 15, 15)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayCourseStudents)
                    .addComponent(setYear))
                .addGap(15, 15, 15)
                .addComponent(deleteCourseBtn)
                .addGap(20, 20, 20))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("تعديل بيانات الصفوف");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(coursesSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(courseButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(coursesSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTblMouseClicked
        int i = coursesTbl.getSelectedRow();
        TableModel tableModel = coursesTbl.getModel();
        try {
            selectedCourse = new Course(new Double(tableModel.getValueAt(i, 0).toString())
                    .intValue());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ في الوصول لهذا الصف!");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_coursesTblMouseClicked

    private void setNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameActionPerformed
        if (isBadSelection()) {
            return;
        }
        String courseName = (String) JOptionPane.showInputDialog(rootPane, "اسم الصف الجديد :",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null, selectedCourse.getName());

        if (courseName == null) {
            return;
        } else if (courseName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "لا يمكن أن يكون الاسم فارغاً");
            setNameActionPerformed(evt);
        }

        try {
            selectedCourse.setName(courseName);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة في تسمية الصف بهذا الاسم");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setNameActionPerformed

    private void setTeacherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTeacherNameActionPerformed
        if (isBadSelection()) {
            return;
        }
        String teacherName = (String) JOptionPane.showInputDialog(rootPane, "اسم المدرسة الجديد :",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedCourse.getTeacherName());

        if (teacherName == null) {
            return;
        } else if (teacherName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "لا يمكن أن يكون اسم المدرسة فارغاً");
            setTeacherNameActionPerformed(evt);
        }

        try {
            selectedCourse.setTeacherName(teacherName);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء إعادة التسمية بهذا الاسم");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setTeacherNameActionPerformed

    private void deleteCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "هل أنت متأكد أنك تريد حذف هذا الصف ؟", "حذف الصف", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedCourse.delete();
            selectedCourse = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء حذف هذا الصف");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_deleteCourseBtnActionPerformed

    private void displayCourseStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCourseStudentsActionPerformed
        GUI_Util.link_frame_to_button(GUI_Util.displayItemsInJTable((table) -> {
            try {
                table.setModel(selectedCourse.getStudentsAsTable());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "حدث خطأ أثناء إظهار طلاب الصف");
                System.err.println(ex);
            }
        }), displayCourseStudents);
    }//GEN-LAST:event_displayCourseStudentsActionPerformed

    private void setYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setYearActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.promoteComboBox("تغيير سن الصف", "السن الجديد للصف سيكون :",
                "تعيين السن الجديد", CoursesUtil.getYearsAsComboBox(), (year) -> {
            if ("أريد إدخال نصاً مختلفاً".equals(year)) {
                year = (String) JOptionPane.showInputDialog(rootPane, "السن الجديد :",
                        "أعد التعيين", JOptionPane.QUESTION_MESSAGE, null, null, null);
            }
            try {
                selectedCourse.setYear(year);
                updateTableAndDataPnl();
                JOptionPane.showMessageDialog(rootPane, "تمت إعادة تعيين السن بنجاح!");
                return true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء إعادة تعيين السن");
                System.out.println(ex);
            }
            return false;
        }), setYear);
    }//GEN-LAST:event_setYearActionPerformed
    /* if (isBadSelection()) {
            return;
        }
        try {
            link_frame_to_button(promoteComboBox("تغيير سن الصف", "السن الجديد للصف سيكون :",
                    "تعيين السن الجديد", buildComboBoxModel(getStudentsIdAndName()), (AddedById) -> {
                try {
                    selectedStudent.setAddedBy(Integer.parseInt(AddedById.substring(1,
                            AddedById.indexOf(")"))));
                    updateTable();
                    JOptionPane.showMessageDialog(rootPane, "Student AddedBy change successfully");
                    return true;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                    printEx(ex);
                }
                return false;
            }), setAddedByBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courseButtonsPnl;
    private javax.swing.JPanel courseDataPnl;
    private javax.swing.JTextField courseIdTf;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JTextField courseTeacherTf;
    private javax.swing.JTextField courseYearTf;
    private javax.swing.JScrollPane coursesSPnl;
    private javax.swing.JTable coursesTbl;
    private javax.swing.JButton deleteCourseBtn;
    private javax.swing.JButton displayCourseStudents;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton setName;
    private javax.swing.JButton setTeacherName;
    private javax.swing.JButton setYear;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTableAndDataPnl() {
        try {
            this.coursesTbl.setModel(CoursesUtil.getCoursesAsTable());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء إظهار الصفوف !");
            System.err.println(ex);
        }
        if (selectedCourse == null) {
            courseIdTf.setText("");
            courseNameTf.setText("");
            courseTeacherTf.setText("");
            courseYearTf.setText("");
        } else {
            courseIdTf.setText(String.valueOf(selectedCourse.getId()));
            courseNameTf.setText(selectedCourse.getName());
            courseTeacherTf.setText(selectedCourse.getTeacherName());
            courseYearTf.setText(selectedCourse.getYear());
        }
    }

    private boolean isBadSelection() {
        if (selectedCourse == null) {
            JOptionPane.showMessageDialog(rootPane, "قم بإختيار الصف المطلوب للقيام بهذه العملية");
            return true;
        }
        return false;
    }

    private void setUpImg() {
        imgLbl.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(this.getClass().
                getClassLoader().getResource("img/Roda.jpg")).getImage().getScaledInstance(
                imgLbl.getWidth(), imgLbl.getHeight(), java.awt.Image.SCALE_DEFAULT)));
    }
}
