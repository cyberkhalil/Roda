package gui.course;

import core.course.CoursesUtil;
import javax.swing.JOptionPane;
import util.gui.GUI_Util;

public class AddCourse extends javax.swing.JFrame {

    public AddCourse() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        yearCB.setSelectedIndex(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        contentPnl = new javax.swing.JPanel();
        contentTitleLbl = new javax.swing.JLabel();
        addCourseBtn = new javax.swing.JButton();
        courseNameLbl = new javax.swing.JLabel();
        courseNameTf = new javax.swing.JTextField();
        daysLbl1 = new javax.swing.JLabel();
        teacherNameTf = new javax.swing.JTextField();
        daysLbl2 = new javax.swing.JLabel();
        yearCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getClassLoader().getResource("img/Roda.jpg")).getImage());
        setMaximumSize(null);
        setMinimumSize(null);
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(this.contentPnl.getSize()
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("إضافة صف جديد");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentPnl.setBackground(new java.awt.Color(255, 255, 255));
        contentPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("معلومات الصف الجديد");

        addCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addCourseBtn.setForeground(new java.awt.Color(0, 51, 153));
        addCourseBtn.setText("إضافة");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        courseNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseNameLbl.setText("اسم الصف");

        courseNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        daysLbl1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        daysLbl1.setForeground(new java.awt.Color(0, 51, 153));
        daysLbl1.setText("اسم المدرسة");

        teacherNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        daysLbl2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        daysLbl2.setForeground(new java.awt.Color(0, 51, 153));
        daysLbl2.setText("السن");

        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "سن مختلف", "بستان", "تمهيدي" }));

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(teacherNameTf)
                            .addComponent(yearCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysLbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(daysLbl2)
                            .addComponent(courseNameLbl)))
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(contentTitleLbl)
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameLbl))
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysLbl1)
                    .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysLbl2)
                    .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addCourseBtn)
                .addGap(20, 20, 20))
        );

        ((javax.swing.JLabel)yearCB.getRenderer()).setHorizontalAlignment(javax.swing.JLabel.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        if (courseNameTf.getText() == null || courseNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "يجب أن تضع اسماً للصف !");
            return;
        }
        String year = yearCB.getSelectedItem().toString();
        while (year == null || year.equals("سن مختلف") || year.trim().isEmpty()) {
            year = (String) JOptionPane.showInputDialog(rootPane, "السن المختلف ",
                    "تعيين السن", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }
        try {
            CoursesUtil.createCourse(courseNameTf.getText(), teacherNameTf.getText(), year);
            JOptionPane.showMessageDialog(rootPane, "تمت إضافة الصف الجديد بنجاح");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء عملية الإضافة");
            System.err.println(ex);
        }
    }//GEN-LAST:event_addCourseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel courseNameLbl;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JLabel daysLbl1;
    private javax.swing.JLabel daysLbl2;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JTextField teacherNameTf;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JComboBox<String> yearCB;
    // End of variables declaration//GEN-END:variables

}
