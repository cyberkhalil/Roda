package gui.item;

import core.item.ItemsUtil;
import javax.swing.JOptionPane;
import util.gui.GUI_Util;

public class AddItem extends javax.swing.JFrame {

    public AddItem() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        contentPnl = new javax.swing.JPanel();
        contentTitleLbl = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JButton();
        itemNameLbl = new javax.swing.JLabel();
        itemNameTf = new javax.swing.JTextField();
        itemPriceLbl = new javax.swing.JLabel();
        itemDescLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescTa = new javax.swing.JTextArea();
        itemPriceSp = new javax.swing.JSpinner();

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
        titleLbl.setText("إضافة عنصر جديد");

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
        contentTitleLbl.setText("معلومات العنصر الجديد");

        addItemBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addItemBtn.setForeground(new java.awt.Color(0, 51, 153));
        addItemBtn.setText("إضافة");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        itemNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        itemNameLbl.setText("اسم العنصر :");

        itemNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        itemPriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemPriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        itemPriceLbl.setText("سعر العنصر :");

        itemDescLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        itemDescLbl.setForeground(new java.awt.Color(0, 51, 153));
        itemDescLbl.setText("الوصف :");

        itemDescTa.setColumns(20);
        itemDescTa.setRows(5);
        jScrollPane1.setViewportView(itemDescTa);
        itemDescTa.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

        itemPriceSp.setModel(new javax.swing.SpinnerNumberModel(0.0,0,1000,1));

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(itemNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addComponent(itemPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemDescLbl)
                    .addComponent(itemNameLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(contentTitleLbl)
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameLbl))
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceLbl)
                    .addComponent(itemPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemDescLbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(addItemBtn)
                .addGap(20, 20, 20))
        );

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

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        if (itemNameTf.getText() == null || itemNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "يجب أن تضع اسماً للعنصر !");
            return;
        }
        try {
            ItemsUtil.createItem(itemNameTf.getText(), (double) itemPriceSp.getValue(),
                    itemDescTa.getText());
            JOptionPane.showMessageDialog(rootPane, "تمت إضافة العنصر الجديد بنجاح");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء عملية الإضافة");
            System.err.println(ex);
        }
    }//GEN-LAST:event_addItemBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel itemDescLbl;
    private javax.swing.JTextArea itemDescTa;
    private javax.swing.JLabel itemNameLbl;
    private javax.swing.JTextField itemNameTf;
    private javax.swing.JLabel itemPriceLbl;
    private javax.swing.JSpinner itemPriceSp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
