package gui.student;

import core.item.ItemsUtil;
import core.student.Student;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import util.gui.GUI_Util;

class StudentOtherOperations extends javax.swing.JFrame {

    final Student selectedStudent;

    public StudentOtherOperations(Student s) {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        selectedStudent = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JButton();
        displayItemsBtn = new javax.swing.JButton();
        removeItemBtn = new javax.swing.JButton();
        addPurchaseBtn = new javax.swing.JButton();
        displayBalanceBtn = new javax.swing.JButton();
        deletePurchaseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("روضة الإبداع التربوي");

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
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addItemBtn.setText("إضافة عنصر");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        displayItemsBtn.setText("إظهار العناصر");
        displayItemsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayItemsBtnActionPerformed(evt);
            }
        });

        removeItemBtn.setText("حذف عنصر");
        removeItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemBtnActionPerformed(evt);
            }
        });

        addPurchaseBtn.setText("إضافة فاتورة");
        addPurchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPurchaseBtnActionPerformed(evt);
            }
        });

        displayBalanceBtn.setText("إظهار الرصيد");
        displayBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBalanceBtnActionPerformed(evt);
            }
        });

        deletePurchaseBtn.setText("حذف فاتورة");
        deletePurchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePurchaseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeItemBtn)
                    .addComponent(deletePurchaseBtn))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayItemsBtn)
                        .addGap(100, 100, 100)
                        .addComponent(addItemBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayBalanceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPurchaseBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemBtn)
                    .addComponent(displayItemsBtn)
                    .addComponent(removeItemBtn))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPurchaseBtn)
                    .addComponent(displayBalanceBtn)
                    .addComponent(deletePurchaseBtn))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.promoteComboBox("إضافة عنصر", "اختر عنصراً لتسجيله", "أضِف",
                ItemsUtil.getItemsAsComboBox(), (choice) -> {
            try {
                Integer itemId = new Integer(GUI_Util.parseIdFromComboBoxOption(choice));
                selectedStudent.addItem(itemId);
                JOptionPane.showMessageDialog(rootPane, "تمت عملية إضافة العنصر بنجاح");
                return true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حصل خطأ أثناء إضافة العنصر !");
                System.err.println(ex);
                return false;
            }
        }), addItemBtn);
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void displayItemsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayItemsBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.displayItemsInJTable((table) -> {
            table.setModel(selectedStudent.getItemsAsTable());
        }), displayItemsBtn);
    }//GEN-LAST:event_displayItemsBtnActionPerformed

    private void removeItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.promoteComboBox("حذف عنصر", "اختر عنصراً لحذفه", "إحذف",
                selectedStudent.getItemsAsComboBox(), (choice) -> {
            try {
                Integer itemId = new Integer(GUI_Util.parseIdFromComboBoxOption(choice));
                selectedStudent.removeItem(itemId);
                JOptionPane.showMessageDialog(rootPane, "تمت عملية حذف العنصر بنجاح");
                return true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حصل خطأ أثناء حذف العنصر !");
                System.err.println(ex);
                return false;
            }
        }), removeItemBtn);
    }//GEN-LAST:event_removeItemBtnActionPerformed

    private void addPurchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPurchaseBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.promoteComboBoxAndSpinner("إضافة فاتورة",
                "وصف الفاتورة", "قيمة الفاتورة", new SpinnerNumberModel(0, 0, 10_000, 10), "أضف",
                (text, value) -> {
                    try {
                        selectedStudent.addPurchase(value, text);
                        return true;
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "لم تنجح عملية الإضافة");
                        System.err.println(ex);
                        return false;
                    }
                }),
                addPurchaseBtn);
    }//GEN-LAST:event_addPurchaseBtnActionPerformed

    private void displayBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBalanceBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.displayItemsInJTable((table) -> {
            table.setModel(selectedStudent.getBalanceAsTable());
        }), displayItemsBtn);
    }//GEN-LAST:event_displayBalanceBtnActionPerformed

    private void deletePurchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePurchaseBtnActionPerformed
        if (!selectedStudent.isValid()) {
            return;
        }
        GUI_Util.link_frame_to_button(GUI_Util.promoteComboBox("حذف فاتورة", "اختر فاتورة لحذفها",
                "إحذف", selectedStudent.getPurchasesAsComboBox(), (choice) -> {
            try {
                int purchaseId
                        = new Double(GUI_Util.parseIdFromComboBoxOption(choice)).intValue();
                selectedStudent.removePurchase(purchaseId);
                JOptionPane.showMessageDialog(rootPane, "تمت عملية حذف الفاتورة بنجاح");
                return true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "لقد حصل خطأ أثناء حذف الفاتورة !");
                System.err.println(ex);
                return false;
            }
        }), deletePurchaseBtn);
    }//GEN-LAST:event_deletePurchaseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton addPurchaseBtn;
    private javax.swing.JButton deletePurchaseBtn;
    private javax.swing.JButton displayBalanceBtn;
    private javax.swing.JButton displayItemsBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton removeItemBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
