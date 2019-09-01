package gui.student;

import core.course.CoursesUtil;
import core.student.StudentsUtil;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import util.Statics;
import util.gui.GUI_Util;
import util.gui.JSystemFileChooser;

public class AddStudent extends javax.swing.JFrame {

    private String imgPath = "";

    public AddStudent() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        for (java.awt.Component component : contentPnl.getComponents()) {
            if (component instanceof JTextField) {
                JTextField tf = (JTextField) component;
                final String first = tf.getText();
                component.addFocusListener(new java.awt.event.FocusListener() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        GUI_Util.removeTextOnFocusGained(tf);
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        GUI_Util.setTextOnFocusLost(tf, first);
                    }
                });
            } else if (component instanceof JRadioButton) {
                JRadioButton rb = (JRadioButton) component;
                rb.addItemListener((java.awt.event.ItemEvent evt) -> {
                    if (rb.equals(studentOtherRb)) {
                        this.studentCitizenOrRefugeeTf.setEditable(rb.isSelected());
                        this.studentCitizenOrRefugeeTf.setEnabled(rb.isSelected());
                    }
                    if (rb.isSelected()) {
                        this.studentCitizenOrRefugeeTf.setText(rb.getText());
                    }
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentCitizenOrRefugeeBg = new javax.swing.ButtonGroup();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        contentPnl = new javax.swing.JPanel();
        contentTitleLbl = new javax.swing.JLabel();
        studentNameLbl = new javax.swing.JLabel();
        studentFirstNameTf = new javax.swing.JTextField();
        studentFatherNameTf = new javax.swing.JTextField();
        studentGrandFatherNameTf = new javax.swing.JTextField();
        studentFamilyNameTf = new javax.swing.JTextField();
        studentMotherNameTf = new javax.swing.JTextField();
        studentIdentityLbl = new javax.swing.JLabel();
        studentIdentitiyNumberFtf = new javax.swing.JFormattedTextField();
        studentCitizenRb = new javax.swing.JRadioButton();
        studentRefugeeRb = new javax.swing.JRadioButton();
        studentOtherRb = new javax.swing.JRadioButton();
        studentCitizenOrRefugeeTf = new javax.swing.JTextField();
        studentBirthLbl = new javax.swing.JLabel();
        studentBirthDateDp = new org.jdesktop.swingx.JXDatePicker();
        imgPnl = new javax.swing.JPanel();
        studentImgLbl = new javax.swing.JLabel();
        imgChooserBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        studentGuardianInfoLbl = new javax.swing.JLabel();
        studentGruadianNameTf = new javax.swing.JTextField();
        studentGruadianJobTf = new javax.swing.JTextField();
        studentGruadianPhoneNumberFtf = new javax.swing.JFormattedTextField();
        studentAddressTf = new javax.swing.JTextField();
        studentGruadianPhoneLbl = new javax.swing.JLabel();
        studentCourseCb = new javax.swing.JComboBox<>();
        studentCourseLbl = new javax.swing.JLabel();
        studentCourseEnabled = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getClassLoader().getResource("img/Roda.jpg")).getImage());
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
        titleLbl.setText("إضافة طالب جديد");

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
        contentTitleLbl.setText("معلومات الطالب الجديد");

        studentNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentNameLbl.setText("اسم الطالب");

        studentFirstNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentFirstNameTf.setText("(الاسم الأول)");

        studentFatherNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentFatherNameTf.setText("(اسم الأب)");

        studentGrandFatherNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentGrandFatherNameTf.setText("(اسم الجد)");

        studentFamilyNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentFamilyNameTf.setText("(اسم العائلة)");

        studentMotherNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentMotherNameTf.setText("(اسم الأم)");

        studentIdentityLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentIdentityLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentIdentityLbl.setText("الهوية");

        studentIdentitiyNumberFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentIdentitiyNumberFtf.setText("(رقم هوية الطالب)");
        studentIdentitiyNumberFtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentIdentitiyNumberFtfFocusGained(evt);
            }
        });

        studentCitizenRb.setBackground(new java.awt.Color(255, 255, 255));
        studentCitizenOrRefugeeBg.add(studentCitizenRb);
        studentCitizenRb.setText("مواطن");

        studentRefugeeRb.setBackground(new java.awt.Color(255, 255, 255));
        studentCitizenOrRefugeeBg.add(studentRefugeeRb);
        studentRefugeeRb.setText("لاجئ");

        studentOtherRb.setBackground(new java.awt.Color(255, 255, 255));
        studentCitizenOrRefugeeBg.add(studentOtherRb);
        studentOtherRb.setText("غير ذلك");

        studentCitizenOrRefugeeTf.setEditable(false);
        studentCitizenOrRefugeeTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentCitizenOrRefugeeTf.setEnabled(false);

        studentBirthLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentBirthLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentBirthLbl.setText("تاريخ الميلاد");

        imgPnl.setBackground(new java.awt.Color(255, 255, 255));

        studentImgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imgChooserBtn.setText("اختيار صورة");
        imgChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgChooserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imgPnlLayout = new javax.swing.GroupLayout(imgPnl);
        imgPnl.setLayout(imgPnlLayout);
        imgPnlLayout.setHorizontalGroup(
            imgPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgPnlLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(imgChooserBtn)
                .addGap(80, 80, 80))
        );
        imgPnlLayout.setVerticalGroup(
            imgPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPnlLayout.createSequentialGroup()
                .addComponent(studentImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(imgChooserBtn))
        );

        addStudentBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addStudentBtn.setForeground(new java.awt.Color(0, 51, 153));
        addStudentBtn.setText("إضافة");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        studentGuardianInfoLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentGuardianInfoLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentGuardianInfoLbl.setText("معلومات ولي الأمر");

        studentGruadianNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentGruadianNameTf.setText("(الاسم ولي الأمر)");

        studentGruadianJobTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentGruadianJobTf.setText("(وظيفة ولي الأمر)");

        studentGruadianPhoneNumberFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentGruadianPhoneNumberFtf.setText("(رقم هاتف ولي الأمر)");
        studentGruadianPhoneNumberFtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentGruadianPhoneNumberFtfFocusGained(evt);
            }
        });

        studentAddressTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        studentAddressTf.setText("(عنوان السكن)");

        studentGruadianPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentGruadianPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentGruadianPhoneLbl.setText("رقم هاتف ولي الأمر");

        studentCourseCb.setModel(CoursesUtil.getCoursesAsComboBox());

        studentCourseLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentCourseLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentCourseLbl.setText("صف الطالب");

        studentCourseEnabled.setSelected(true);
        studentCourseEnabled.setText("مفعل");
        studentCourseEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCourseEnabledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addComponent(studentGruadianJobTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentGruadianNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(studentMotherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(contentPnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                                                .addComponent(studentOtherRb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studentRefugeeRb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studentCitizenRb))
                                            .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(studentIdentitiyNumberFtf)
                                                .addComponent(studentBirthDateDp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(studentCitizenOrRefugeeTf, javax.swing.GroupLayout.Alignment.TRAILING))))))
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addComponent(studentFamilyNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentGrandFatherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentFatherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentFirstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentNameLbl)
                                    .addComponent(studentBirthLbl)
                                    .addComponent(studentGuardianInfoLbl)))
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(studentIdentityLbl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addComponent(studentCourseEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentCourseCb, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentCourseLbl))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                                .addComponent(studentGruadianPhoneNumberFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentGruadianPhoneLbl)))))
                .addContainerGap())
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(contentTitleLbl)
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentFirstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLbl)
                    .addComponent(studentFatherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentGrandFatherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentFamilyNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addComponent(studentMotherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(studentIdentitiyNumberFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(studentCitizenRb)
                                    .addComponent(studentRefugeeRb)
                                    .addComponent(studentOtherRb)))
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(studentIdentityLbl)))
                        .addGap(5, 5, 5)
                        .addComponent(studentCitizenOrRefugeeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentBirthDateDp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentBirthLbl))
                        .addGap(20, 20, 20)
                        .addComponent(studentGuardianInfoLbl))
                    .addComponent(imgPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentGruadianNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentGruadianJobTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentGruadianPhoneLbl)
                    .addComponent(studentGruadianPhoneNumberFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentCourseCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentCourseLbl)
                    .addComponent(studentCourseEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addStudentBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        if (GUI_Util.AnyTextBetweenBrackets(studentFirstNameTf, studentFamilyNameTf,
                studentFatherNameTf)) {
            JOptionPane.showMessageDialog(rootPane,
                    "يجب أن يتم إدخال " + Statics.STUDENT_NAME_TXT + " والأب والعائلة على الأقل للتسجيل");
            return;
        }
        String motherName = GUI_Util.getTextOrEmpty(studentMotherNameTf);
        String grandFatherName = GUI_Util.getTextOrEmpty(studentGrandFatherNameTf);
        String lastName = GUI_Util.getTextOrEmpty(studentFamilyNameTf);
        String identitiyNumber = GUI_Util.getTextOrEmpty(studentIdentitiyNumberFtf);
        if (!identitiyNumber.matches("^\\d{9}$") || !identitiyNumber.startsWith("4")) {
            identitiyNumber = "";
        }
        String guardianName = GUI_Util.getTextOrEmpty(studentGruadianNameTf);
        String guardianJob = GUI_Util.getTextOrEmpty(studentGruadianJobTf);
        String guardianPhone = GUI_Util.getTextOrEmpty(studentGruadianPhoneNumberFtf);
        if (!guardianPhone.matches("^\\d{10}$") || !guardianPhone.startsWith("059")) {
            guardianPhone = "";
        }
        String citizenOrRefugee = GUI_Util.getTextOrEmpty(studentCitizenOrRefugeeTf);
        String address = GUI_Util.getTextOrEmpty(studentAddressTf);
        int courseId = 0;
        if (studentCourseEnabled.isSelected()) {
            try {
                courseId = new Integer(GUI_Util.parseIdFromComboBoxOption(
                        studentCourseCb.getSelectedItem().toString()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, Statics.NUMBER_TXT + Statics.SPACE
                        + "الصف المدخل غير موجود !");
            }
        }
        try {
            StudentsUtil.createStudent(studentFirstNameTf.getText(), studentFatherNameTf.getText(),
                    motherName, grandFatherName, lastName, studentBirthDateDp.getDate(),
                    identitiyNumber, guardianName, guardianJob, guardianPhone, citizenOrRefugee,
                    address, courseId, imgPath);
            JOptionPane.showMessageDialog(rootPane, "لقد تمت عملية إضافة الطالب بنجاح!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ في عملية تسجيل الطالب.");
            System.out.println(ex);
        }
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void imgChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgChooserBtnActionPerformed
        JFileChooser f = new JSystemFileChooser();
        f.setFileSelectionMode(JFileChooser.FILES_ONLY);
        f.showSaveDialog(rootPane);

        java.io.File selectedImage = f.getSelectedFile();
        if (selectedImage == null) {
            return;
        }
        String imageFileName = selectedImage.getName();
        if (!(imageFileName.contains(".png") || imageFileName.contains(".jpg")
                || imageFileName.contains(".jpeg") || imageFileName.contains(".bmp"))) {
            JOptionPane.showMessageDialog(rootPane, "الرجاء اختيار صورة فقط وليس ملف آخر");
            return;
        }
        try {
            studentImgLbl.setIcon(GUI_Util.setImageIconToLabelSize(
                    new javax.swing.ImageIcon(selectedImage.toString()),
                    studentImgLbl));
            imgPath = selectedImage.toString();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "الملف المحدد ليس صورة صحيحة");
        }
    }//GEN-LAST:event_imgChooserBtnActionPerformed

    private void studentIdentitiyNumberFtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentIdentitiyNumberFtfFocusGained
        if (GUI_Util.TextBetweenBrackets(studentIdentitiyNumberFtf)) {
            studentIdentitiyNumberFtf.setText("");
            try {
                studentIdentitiyNumberFtf.setFormatterFactory(new DefaultFormatterFactory(
                        new MaskFormatter("#########")));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "حصل خطأ في تحويل نمط" + Statics.SPACE
                        + Statics.IDENTITY_NUMBER_TXT + Statics.SPACE + "للأرقام");
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_studentIdentitiyNumberFtfFocusGained

    private void studentGruadianPhoneNumberFtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentGruadianPhoneNumberFtfFocusGained
        if (GUI_Util.TextBetweenBrackets(studentGruadianPhoneNumberFtf)) {
            studentGruadianPhoneNumberFtf.setText("");
            try {
                studentGruadianPhoneNumberFtf.setFormatterFactory(new DefaultFormatterFactory(
                        new MaskFormatter("##########")));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "حصل خطأ في تحويل نمط" + Statics.SPACE
                        + Statics.PHONE_TXT);
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_studentGruadianPhoneNumberFtfFocusGained

    private void studentCourseEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCourseEnabledActionPerformed
        studentCourseCb.setEditable(studentCourseEnabled.isSelected());
        studentCourseCb.setEnabled(studentCourseEnabled.isSelected());
    }//GEN-LAST:event_studentCourseEnabledActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JButton imgChooserBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JPanel imgPnl;
    private javax.swing.JTextField studentAddressTf;
    private org.jdesktop.swingx.JXDatePicker studentBirthDateDp;
    private javax.swing.JLabel studentBirthLbl;
    private javax.swing.ButtonGroup studentCitizenOrRefugeeBg;
    private javax.swing.JTextField studentCitizenOrRefugeeTf;
    private javax.swing.JRadioButton studentCitizenRb;
    private javax.swing.JComboBox<String> studentCourseCb;
    private javax.swing.JToggleButton studentCourseEnabled;
    private javax.swing.JLabel studentCourseLbl;
    private javax.swing.JTextField studentFamilyNameTf;
    private javax.swing.JTextField studentFatherNameTf;
    private javax.swing.JTextField studentFirstNameTf;
    private javax.swing.JTextField studentGrandFatherNameTf;
    private javax.swing.JTextField studentGruadianJobTf;
    private javax.swing.JTextField studentGruadianNameTf;
    private javax.swing.JLabel studentGruadianPhoneLbl;
    private javax.swing.JFormattedTextField studentGruadianPhoneNumberFtf;
    private javax.swing.JLabel studentGuardianInfoLbl;
    private javax.swing.JFormattedTextField studentIdentitiyNumberFtf;
    private javax.swing.JLabel studentIdentityLbl;
    private javax.swing.JLabel studentImgLbl;
    private javax.swing.JTextField studentMotherNameTf;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JRadioButton studentOtherRb;
    private javax.swing.JRadioButton studentRefugeeRb;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
