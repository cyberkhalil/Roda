package gui.student;

import core.course.Course;
import core.course.CoursesUtil;
import core.student.Student;
import core.student.StudentsUtil;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import util.Statics;
import util.gui.GUI_Util;
import util.gui.JSystemFileChooser;

public class EditStudents extends javax.swing.JFrame {

    private Student selectedStudent;

    public EditStudents() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        updateTableAndDataPnl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        itemsSPnl = new javax.swing.JScrollPane();
        studentsTbl = new javax.swing.JTable();
        itemDataPnl = new javax.swing.JPanel();
        studentImgLbl = new javax.swing.JLabel();
        studentdTf = new javax.swing.JTextField();
        studentNameTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentMotherNameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        studentBirthDateTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        studentIdentitiyNumberTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        studentGuardianNameTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        studentPhoneNumberTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        studentCourseTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentBalanceTf = new javax.swing.JTextField();
        studentButtonsPnl = new javax.swing.JPanel();
        setFirstNameBtn = new javax.swing.JButton();
        setFatherNameBtn = new javax.swing.JButton();
        setGrandFatherNameBtn = new javax.swing.JButton();
        setLastNameBtn = new javax.swing.JButton();
        setMotherNameBtn = new javax.swing.JButton();
        setBirthDateBtn = new javax.swing.JButton();
        setIdentitiyNumberBtn = new javax.swing.JButton();
        setGuardianNameBtn = new javax.swing.JButton();
        setGuardianJobBtn = new javax.swing.JButton();
        setGuardianPhoneBtn = new javax.swing.JButton();
        setSitizenOrRefugeeBtn = new javax.swing.JButton();
        setAddressBtn = new javax.swing.JButton();
        setImageBtn = new javax.swing.JButton();
        setCourseIdBtn = new javax.swing.JButton();
        otherOperations = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getClassLoader().getResource("img/Roda.jpg")).getImage());
        setResizable(false);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("تعديل بيانات الطلاب");

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

        studentsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        studentsTbl.setRowHeight(40);
        studentsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTblMouseClicked(evt);
            }
        });
        itemsSPnl.setViewportView(studentsTbl);

        itemDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        itemDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentImgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        studentdTf.setEditable(false);
        studentdTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        studentNameTf.setEditable(false);
        studentNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("رقم الطالب");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("اسم الطالب");

        studentMotherNameTf.setEditable(false);
        studentMotherNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم الأم");

        studentBirthDateTf.setEditable(false);
        studentBirthDateTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("تاريخ الميلاد");

        studentIdentitiyNumberTf.setEditable(false);
        studentIdentitiyNumberTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الهوية");

        studentGuardianNameTf.setEditable(false);
        studentGuardianNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("اسم ولي الأمر");

        studentPhoneNumberTf.setEditable(false);
        studentPhoneNumberTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("رقم الهاتف");

        studentCourseTf.setEditable(false);
        studentCourseTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("صف الطالب");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("رصيد الطالب");

        studentBalanceTf.setEditable(false);
        studentBalanceTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout itemDataPnlLayout = new javax.swing.GroupLayout(itemDataPnl);
        itemDataPnl.setLayout(itemDataPnlLayout);
        itemDataPnlLayout.setHorizontalGroup(
            itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDataPnlLayout.createSequentialGroup()
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(itemDataPnlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemDataPnlLayout.createSequentialGroup()
                                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentMotherNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(itemDataPnlLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(itemDataPnlLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(studentImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(itemDataPnlLayout.createSequentialGroup()
                                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(studentIdentitiyNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentBirthDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentGuardianNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentPhoneNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentCourseTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))))
                    .addGroup(itemDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentBalanceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(7, 7, 7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        itemDataPnlLayout.setVerticalGroup(
            itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDataPnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(studentImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentMotherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentBirthDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdentitiyNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentGuardianNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentPhoneNumberTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentCourseTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(studentBalanceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        studentButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        studentButtonsPnl.setAlignmentX(0.0F);
        studentButtonsPnl.setAlignmentY(0.0F);

        setFirstNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setFirstNameBtn.setText("تعديل اسم الطالب الأول");
        setFirstNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFirstNameBtnActionPerformed(evt);
            }
        });

        setFatherNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setFatherNameBtn.setText("تعديل اسم الأب");
        setFatherNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFatherNameBtnActionPerformed(evt);
            }
        });

        setGrandFatherNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setGrandFatherNameBtn.setText("تعديل اسم الجد");
        setGrandFatherNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setGrandFatherNameBtnActionPerformed(evt);
            }
        });

        setLastNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setLastNameBtn.setText("تعديل اسم العائلة");
        setLastNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLastNameBtnActionPerformed(evt);
            }
        });

        setMotherNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setMotherNameBtn.setText("تعديل اسم الأم");
        setMotherNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMotherNameBtnActionPerformed(evt);
            }
        });

        setBirthDateBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setBirthDateBtn.setText("تعديل تاريخ الميلاد");
        setBirthDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBirthDateBtnActionPerformed(evt);
            }
        });

        setIdentitiyNumberBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setIdentitiyNumberBtn.setText("تعديل رقم الهوية");
        setIdentitiyNumberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setIdentitiyNumberBtnActionPerformed(evt);
            }
        });

        setGuardianNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setGuardianNameBtn.setText("تعديل اسم ولي الأمر");
        setGuardianNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setGuardianNameBtnActionPerformed(evt);
            }
        });

        setGuardianJobBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setGuardianJobBtn.setText("تعديل وظيفة ولي الأمر");
        setGuardianJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setGuardianJobBtnActionPerformed(evt);
            }
        });

        setGuardianPhoneBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setGuardianPhoneBtn.setText("تعديل هاتف ولي الأمر");
        setGuardianPhoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setGuardianPhoneBtnActionPerformed(evt);
            }
        });

        setSitizenOrRefugeeBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setSitizenOrRefugeeBtn.setText("تعديل مواطن/لاجئ");
        setSitizenOrRefugeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSitizenOrRefugeeBtnActionPerformed(evt);
            }
        });

        setAddressBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setAddressBtn.setText("تعديل العنوان");
        setAddressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAddressBtnActionPerformed(evt);
            }
        });

        setImageBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setImageBtn.setText("تعديل الصورة");
        setImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setImageBtnActionPerformed(evt);
            }
        });

        setCourseIdBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setCourseIdBtn.setText("تعديل الصف");
        setCourseIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCourseIdBtnActionPerformed(evt);
            }
        });

        otherOperations.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        otherOperations.setText("عمليات أخرى");
        otherOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherOperationsActionPerformed(evt);
            }
        });

        deleteStudentBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteStudentBtn.setText("حذف الطالب");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentButtonsPnlLayout = new javax.swing.GroupLayout(studentButtonsPnl);
        studentButtonsPnl.setLayout(studentButtonsPnlLayout);
        studentButtonsPnlLayout.setHorizontalGroup(
            studentButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentButtonsPnlLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(studentButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setCourseIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setAddressBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setSitizenOrRefugeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setGuardianPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setGuardianJobBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setGuardianNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setIdentitiyNumberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setBirthDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setMotherNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setLastNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setGrandFatherNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setFatherNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setFirstNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        studentButtonsPnlLayout.setVerticalGroup(
            studentButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentButtonsPnlLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(setFirstNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setFatherNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setGrandFatherNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setLastNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setMotherNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setBirthDateBtn)
                .addGap(10, 10, 10)
                .addComponent(setIdentitiyNumberBtn)
                .addGap(10, 10, 10)
                .addComponent(setGuardianNameBtn)
                .addGap(10, 10, 10)
                .addComponent(setGuardianJobBtn)
                .addGap(10, 10, 10)
                .addComponent(setGuardianPhoneBtn)
                .addGap(10, 10, 10)
                .addComponent(setSitizenOrRefugeeBtn)
                .addGap(10, 10, 10)
                .addComponent(setAddressBtn)
                .addGap(10, 10, 10)
                .addComponent(setImageBtn)
                .addGap(10, 10, 10)
                .addComponent(setCourseIdBtn)
                .addGap(10, 10, 10)
                .addComponent(otherOperations)
                .addGap(10, 10, 10)
                .addComponent(deleteStudentBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(studentButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(itemDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(itemsSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsSPnl))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTblMouseClicked
        int i = studentsTbl.getSelectedRow();
        TableModel tableModel = studentsTbl.getModel();
        try {
            selectedStudent = new Student(new Double(tableModel.getValueAt(i, 0).toString())
                    .intValue());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ في الوصول لهذا الطالب!");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_studentsTblMouseClicked

    private void setFirstNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFirstNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, Statics.THE_NAME_TXT
                + Statics.SPACE + "الأول للطالب", "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null,
                null, selectedStudent.getFirstName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setFirstNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setFirstName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setFirstNameBtnActionPerformed

    private void setFatherNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFatherNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, "اسم أب الطالب",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getFatherName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setFatherNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setFatherName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setFatherNameBtnActionPerformed

    private void setGrandFatherNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setGrandFatherNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, "اسم جد الطالب",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getGrandFatherName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setGrandFatherNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setGrandFatherName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setGrandFatherNameBtnActionPerformed

    private void setLastNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLastNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, "اسم عائلة الطالب",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getLastName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setLastNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setLastName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setLastNameBtnActionPerformed

    private void setMotherNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setMotherNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, "اسم أم الطالب",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getMotherName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setMotherNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setMotherName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setMotherNameBtnActionPerformed

    private void setBirthDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBirthDateBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.promoteDatePicker("تعديل تاريخ الميلاد", "تاريخ الميلاد", "عدل التاريخ",
                (DateInMillis) -> {
                    try {
                        selectedStudent.setBirthDate(new Date(DateInMillis));
                        updateTableAndDataPnl();
                        JOptionPane.showMessageDialog(rootPane, "تم تعديل تاريخ الميلاد بنجاح!");
                        return true;
                    } catch (Exception ex) {
                        updateTableAndDataPnl();
                        JOptionPane.showMessageDialog(rootPane, "حدثت مشكلة في تعديل تاريخ الميلاد");
                        return false;
                    }
                });
    }//GEN-LAST:event_setBirthDateBtnActionPerformed

    private void setIdentitiyNumberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setIdentitiyNumberBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String number = (String) JOptionPane.showInputDialog(rootPane, Statics.IDENTITY_NUMBER_TXT,
                "أعد التعيين", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getIdentityNumber());

        if (number == null) {   //return
        } else if (number.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_IDENTITY_EXC_MSG);
            setIdentitiyNumberBtnActionPerformed(evt);
        } else if (!number.matches("[0-9]{9}")) {
            JOptionPane.showMessageDialog(rootPane, "يجب أن يتكون " + Statics.IDENTITY_NUMBER_TXT
                    + " من 9 أرقام فقط!");
            setIdentitiyNumberBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setIdentityNumber(number);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء تعيين "
                        + Statics.IDENTITY_NUMBER_TXT);
                System.err.println(ex);
            }
            updateTableAndDataPnl();
        }
    }//GEN-LAST:event_setIdentitiyNumberBtnActionPerformed

    private void setGuardianNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setGuardianNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String name = (String) JOptionPane.showInputDialog(rootPane, "اسم ولي الأمر",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getGuardianName());

        if (name == null) {
            return;
        } else if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_NAME_EXC_MSG);
            setGuardianNameBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setGuardianName(name);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء التسمية بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setGuardianNameBtnActionPerformed

    private void setGuardianJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setGuardianJobBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String job = (String) JOptionPane.showInputDialog(rootPane, "وظيفة ولي الأمر",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getGuardianJob());

        if (job == null) {
            return;
        } else if (job.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_JOB_NAME_EXC_MSG);
            setGuardianJobBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setGuardianJob(job);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء وضع الوظيفة بهذا"
                        + Statics.SPACE + Statics.THE_NAME_TXT);
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setGuardianJobBtnActionPerformed

    private void setGuardianPhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setGuardianPhoneBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String number = (String) JOptionPane.showInputDialog(rootPane, Statics.PHONE_NUMBER_TXT,
                "أعد التعيين", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getGuardianPhone());

        if (number == null) {   // return
        } else if (number.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_PHONE_EXC_MSG);
            setGuardianPhoneBtnActionPerformed(evt);
        } else if (!number.matches("[0-9]{10}")) {
            JOptionPane.showMessageDialog(rootPane, "يجب أن يتكون" + Statics.PHONE_NUMBER_TXT
                    + " من 10 أرقام فقط!");
            setGuardianPhoneBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setGuardianPhone(number);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء تعيين "
                        + Statics.PHONE_NUMBER_TXT);
                System.err.println(ex);
            }
            updateTableAndDataPnl();
        }
    }//GEN-LAST:event_setGuardianPhoneBtnActionPerformed

    private void setSitizenOrRefugeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSitizenOrRefugeeBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String state = (String) JOptionPane.showInputDialog(rootPane, "مواطن أم لاجئ",
                "أعد التعيين", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getCitizenOrRefugee());

        if (state == null) {
            return;
        } else if (state.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.CANNOT_BEE_TXT + Statics.SPACE + "الحالة"
                    + Statics.SPACE + Statics.EMPTYY_TXT);
            setSitizenOrRefugeeBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setCitizenOrRefugee(state);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء تعيين حالة مواطن/لاجئ");
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setSitizenOrRefugeeBtnActionPerformed

    private void setAddressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAddressBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String address = (String) JOptionPane.showInputDialog(rootPane, "العنوان",
                "أعد التعيين", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedStudent.getAddress());

        if (address == null) {
            return;
        } else if (address.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, Statics.EMPTY_ADDRESS_EXC_MSG);
            setAddressBtnActionPerformed(evt);
        } else {
            try {
                selectedStudent.setAddress(address);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حصل خطأ أثناء تعيين العنوان");
                System.err.println(ex);
            }
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setAddressBtnActionPerformed

    private void setImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setImageBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
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
            setImageBtnActionPerformed(evt);
        }
        try {
            selectedStudent.setImage(selectedImage.toString());
            JOptionPane.showMessageDialog(rootPane, "تم تعيين الصورة بنجاح!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لم يتم تعيين الصورة للطالب بشكل صحيح");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setImageBtnActionPerformed

    private void setCourseIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCourseIdBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.promoteComboBox("صف الطالب", "اختر صفاً للطالب", "اختر",
                CoursesUtil.getCoursesAsComboBox(), (choice) -> {
            try {
                Integer courseId = new Integer(GUI_Util.parseIdFromComboBoxOption(choice));
                selectedStudent.setCourse(courseId);
                JOptionPane.showMessageDialog(rootPane, "تمت عملية اختيار الصف بنجاح");
                updateTableAndDataPnl();
                return true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, Statics.NUMBER_TXT + " الصف المدخل غير موجود !");
                System.err.println(ex);
                updateTableAndDataPnl();
                return false;
            }
        });
    }//GEN-LAST:event_setCourseIdBtnActionPerformed

    private void otherOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherOperationsActionPerformed
        if (isBadSelection()) {
            return;
        }
        StudentOtherOperations frame = new StudentOtherOperations(selectedStudent);
        frame.setVisible(true);
        GUI_Util.link_frame_to_button(frame, otherOperations);
        updateTableAndDataPnl();
    }//GEN-LAST:event_otherOperationsActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "هل أنت متأكد أنك تريد حذف هذا الطالب ؟", "حذف الطالب", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedStudent.delete();
            selectedStudent = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء حذف هذا الطالب");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JPanel itemDataPnl;
    private javax.swing.JScrollPane itemsSPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton otherOperations;
    private javax.swing.JButton setAddressBtn;
    private javax.swing.JButton setBirthDateBtn;
    private javax.swing.JButton setCourseIdBtn;
    private javax.swing.JButton setFatherNameBtn;
    private javax.swing.JButton setFirstNameBtn;
    private javax.swing.JButton setGrandFatherNameBtn;
    private javax.swing.JButton setGuardianJobBtn;
    private javax.swing.JButton setGuardianNameBtn;
    private javax.swing.JButton setGuardianPhoneBtn;
    private javax.swing.JButton setIdentitiyNumberBtn;
    private javax.swing.JButton setImageBtn;
    private javax.swing.JButton setLastNameBtn;
    private javax.swing.JButton setMotherNameBtn;
    private javax.swing.JButton setSitizenOrRefugeeBtn;
    private javax.swing.JTextField studentBalanceTf;
    private javax.swing.JTextField studentBirthDateTf;
    private javax.swing.JPanel studentButtonsPnl;
    private javax.swing.JTextField studentCourseTf;
    private javax.swing.JTextField studentGuardianNameTf;
    private javax.swing.JTextField studentIdentitiyNumberTf;
    private javax.swing.JLabel studentImgLbl;
    private javax.swing.JTextField studentMotherNameTf;
    private javax.swing.JTextField studentNameTf;
    private javax.swing.JTextField studentPhoneNumberTf;
    private javax.swing.JTextField studentdTf;
    private javax.swing.JTable studentsTbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTableAndDataPnl() {
        try {
            StudentsUtil.renderStudentsFormatedToTable(studentsTbl);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء إظهار العنصار !");
            System.err.println(ex);
        }
        if (selectedStudent == null) {
            studentImgLbl.setIcon(
                    GUI_Util.setImageIconToLabelSize(
                            new ImageIcon(Statics.NULL_IMAGE_FILE.toString()), studentImgLbl));
            studentdTf.setText("");
            studentNameTf.setText("");
            studentMotherNameTf.setText("");
            studentBirthDateTf.setText("");
            studentIdentitiyNumberTf.setText("");
            studentGuardianNameTf.setText("");
            studentPhoneNumberTf.setText("");
            studentCourseTf.setText("");
            studentBalanceTf.setText("");
        } else {
            studentImgLbl.setIcon(GUI_Util.setImageIconToLabelSize(
                    GUI_Util.getImageIconFromCellString(selectedStudent.getImage()),
                    studentImgLbl));
            studentdTf.setText(String.valueOf(selectedStudent.getId()));
            studentNameTf.setText(selectedStudent.getFullName());
            studentMotherNameTf.setText(selectedStudent.getMotherName());
            studentBirthDateTf.setText(selectedStudent.getBirthDate());
            studentIdentitiyNumberTf.setText(selectedStudent.getIdentityNumber());
            studentGuardianNameTf.setText(selectedStudent.getGuardianName());
            studentPhoneNumberTf.setText(selectedStudent.getGuardianPhone());
            Course c = new Course(selectedStudent.getCourseId());
            studentCourseTf.setText(c.getName() + "(id=" + c.getId() + ")");
            studentBalanceTf.setText(selectedStudent.getBalance() + "");
        }
    }

    private boolean isBadSelection() {
        if (selectedStudent == null) {
            JOptionPane.showMessageDialog(rootPane, "قم بإختيار طالب للقيام بهذه العملية");
            return true;
        }
        return false;
    }
}
