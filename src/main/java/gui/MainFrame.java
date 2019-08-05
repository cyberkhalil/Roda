package gui;

import com.alee.laf.WebLookAndFeel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.PreRun;

public class MainFrame extends JFrame {

    public MainFrame() {

        initComponents();

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(MainFrame.class.getClassLoader().
                getResource("img/Roda.jpg")).getImage().getScaledInstance(
                imgLbl.getWidth(), imgLbl.getHeight(), Image.SCALE_DEFAULT));
        imgLbl.setIcon(imageIcon);
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
        itemEdiBtn1 = new javax.swing.JButton();
        contentTitleLbl = new javax.swing.JLabel();
        coursesPnl = new javax.swing.JPanel();
        coursesTitleLbl = new javax.swing.JLabel();
        courseAddBtn = new javax.swing.JButton();
        editCoursesBtn = new javax.swing.JButton();
        printCoursesInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(MainFrame.class.getClassLoader().getResource("img/Roda.jpg")).getImage());
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

        editStudentsBtn.setText("تعديل بيانات الطلاب");

        printStudentsInfoBtn.setText("طباعة بيانات الطلاب");

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

        itemEdiBtn.setText("تعديل بيانات العناصر");

        itemEdiBtn1.setText("طباعة بيانات العناصر");

        javax.swing.GroupLayout itemsPnlLayout = new javax.swing.GroupLayout(itemsPnl);
        itemsPnl.setLayout(itemsPnlLayout);
        itemsPnlLayout.setHorizontalGroup(
            itemsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(itemsPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(itemsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemEdiBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(itemEdiBtn1)
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

        editCoursesBtn.setText("تعديل بيانات الصفوف");

        printCoursesInfoBtn.setText("طباعة بيانات الصفوف");

        javax.swing.GroupLayout coursesPnlLayout = new javax.swing.GroupLayout(coursesPnl);
        coursesPnl.setLayout(coursesPnlLayout);
        coursesPnlLayout.setHorizontalGroup(
            coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursesPnlLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printCoursesInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editCoursesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout content_jPanelLayout = new javax.swing.GroupLayout(content_jPanel);
        content_jPanel.setLayout(content_jPanelLayout);
        content_jPanelLayout.setHorizontalGroup(
            content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(studentsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(itemsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        content_jPanelLayout.setVerticalGroup(
            content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_jPanelLayout.createSequentialGroup()
                .addComponent(contentTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(studentsPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coursesPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
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
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel contentTitleLbl;
    protected javax.swing.JPanel content_jPanel;
    private javax.swing.JButton courseAddBtn;
    protected javax.swing.JPanel coursesPnl;
    private javax.swing.JLabel coursesTitleLbl;
    private javax.swing.JButton editCoursesBtn;
    private javax.swing.JButton editStudentsBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton itemAddBtn;
    private javax.swing.JButton itemEdiBtn;
    private javax.swing.JButton itemEdiBtn1;
    private javax.swing.JLabel itemLbl;
    protected javax.swing.JPanel itemsPnl;
    private javax.swing.JButton printCoursesInfoBtn;
    private javax.swing.JButton printStudentsInfoBtn;
    private javax.swing.JButton studentAddBtn;
    private javax.swing.JLabel studentTitleLbl;
    protected javax.swing.JPanel studentsPnl;
    private javax.swing.JLabel titleLbl;
    protected javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        try {
            PreRun.CheckAndPrepare();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "حدث خطأ أثناء تنصيب البرنامج ,"
                    + "الرجاء المحاولة من الجديد");
            System.out.println(ex);
        }

        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "لا يمكن تشغيل ميزة الظهور بشكل مناسب");
            System.out.println(ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

}
