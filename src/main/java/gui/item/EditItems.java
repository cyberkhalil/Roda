package gui.item;

import core.item.Item;
import core.item.ItemsUtil;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import util.gui.GUI_Util;

public class EditItems extends javax.swing.JFrame {

    private Item selectedItem;

    public EditItems() {
        initComponents();
        GUI_Util.setUpRodaImgLbl(imgLbl);
        updateTableAndDataPnl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemsSPnl = new javax.swing.JScrollPane();
        itemsTbl = new javax.swing.JTable();
        itemDataPnl = new javax.swing.JPanel();
        itemIdTf = new javax.swing.JTextField();
        itemNameTf = new javax.swing.JTextField();
        itemPriceTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemDescTa = new javax.swing.JTextArea();
        itemButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setPriceBtn = new javax.swing.JButton();
        setDescBtn = new javax.swing.JButton();
        displayItemStudentsBtn = new javax.swing.JButton();
        deleteItemBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getClassLoader().getResource("img/Roda.jpg")).getImage());
        setResizable(false);

        itemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itemsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        itemsTbl.setSurrendersFocusOnKeystroke(true);
        itemsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTblMouseClicked(evt);
            }
        });
        itemsSPnl.setViewportView(itemsTbl);

        itemDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        itemDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        itemIdTf.setEditable(false);
        itemIdTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        itemNameTf.setEditable(false);
        itemNameTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        itemPriceTf.setEditable(false);
        itemPriceTf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("رقم العنصر :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("اسم العنصر :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("سعر العنصر :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("الوصف :");

        itemDescTa.setEditable(false);
        itemDescTa.setColumns(20);
        itemDescTa.setRows(5);
        itemDescTa.setEnabled(false);
        jScrollPane1.setViewportView(itemDescTa);
        itemDescTa.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

        javax.swing.GroupLayout itemDataPnlLayout = new javax.swing.GroupLayout(itemDataPnl);
        itemDataPnl.setLayout(itemDataPnlLayout);
        itemDataPnlLayout.setHorizontalGroup(
            itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDataPnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(itemPriceTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemIdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        itemDataPnlLayout.setVerticalGroup(
            itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDataPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(itemDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        itemButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        itemButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        itemButtonsPnl.setAlignmentX(0.0F);
        itemButtonsPnl.setAlignmentY(0.0F);

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("تعديل اسم العنصر");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setPriceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPriceBtn.setText("تعديل سعر العنصر");
        setPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceBtnActionPerformed(evt);
            }
        });

        setDescBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDescBtn.setText("تعديل الوصف");
        setDescBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDescBtnActionPerformed(evt);
            }
        });

        displayItemStudentsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayItemStudentsBtn.setText("إظهار طلاب العنصر");
        displayItemStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayItemStudentsBtnActionPerformed(evt);
            }
        });

        deleteItemBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteItemBtn.setText("حذف العنصر");
        deleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemButtonsPnlLayout = new javax.swing.GroupLayout(itemButtonsPnl);
        itemButtonsPnl.setLayout(itemButtonsPnlLayout);
        itemButtonsPnlLayout.setHorizontalGroup(
            itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setPriceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayItemStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setDescBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        itemButtonsPnlLayout.setVerticalGroup(
            itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPriceBtn)
                    .addComponent(setNameBtn))
                .addGap(15, 15, 15)
                .addGroup(itemButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayItemStudentsBtn)
                    .addComponent(setDescBtn))
                .addGap(15, 15, 15)
                .addComponent(deleteItemBtn)
                .addGap(20, 20, 20))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("تعديل بيانات العناصر");

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
                    .addComponent(itemButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(itemsSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(itemButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemsSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTblMouseClicked
        int i = itemsTbl.getSelectedRow();
        TableModel tableModel = itemsTbl.getModel();
        try {
            selectedItem = new Item(new Double(tableModel.getValueAt(i, 0).toString())
                    .intValue());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ في الوصول لهذا الصف!");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_itemsTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String itemName = (String) JOptionPane.showInputDialog(rootPane, "الاسم الجديد للعنصر :",
                "أعد التسمية", JOptionPane.QUESTION_MESSAGE, null, null, selectedItem.getName());

        if (itemName == null) {
            return;
        } else if (itemName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "لا يمكن أن يكون الاسم فارغاً");
            setNameBtnActionPerformed(evt);
        }

        try {
            selectedItem.setName(itemName);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء تسمية العنصر بهذا الاسم");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private void deleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "هل أنت متأكد أنك تريد حذف هذا العنصر ؟", "حذف العنصر", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedItem.delete();
            selectedItem = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدثت مشكلة أثناء حذف هذا العنصر");
            System.err.println(ex);
        }
        updateTableAndDataPnl();
    }//GEN-LAST:event_deleteItemBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setPriceBtnActionPerformed

    private void setDescBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDescBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setDescBtnActionPerformed

    private void displayItemStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayItemStudentsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayItemStudentsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JButton displayItemStudentsBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JPanel itemButtonsPnl;
    private javax.swing.JPanel itemDataPnl;
    private javax.swing.JTextArea itemDescTa;
    private javax.swing.JTextField itemIdTf;
    private javax.swing.JTextField itemNameTf;
    private javax.swing.JTextField itemPriceTf;
    private javax.swing.JScrollPane itemsSPnl;
    private javax.swing.JTable itemsTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton setDescBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTableAndDataPnl() {
        try {
            this.itemsTbl.setModel(ItemsUtil.getItemsAsTable());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء إظهار العنصار !");
            System.err.println(ex);
        }
        if (selectedItem == null) {
            itemIdTf.setText("");
            itemNameTf.setText("");
            itemPriceTf.setText("");
            itemDescTa.setText("");
        } else {
            itemIdTf.setText(String.valueOf(selectedItem.getId()));
            itemNameTf.setText(selectedItem.getName());
            itemPriceTf.setText(Double.toString(selectedItem.getPrice()));
            itemDescTa.setText(selectedItem.getDescription());
        }
    }

    private boolean isBadSelection() {
        if (selectedItem == null) {
            JOptionPane.showMessageDialog(rootPane, "قم بإختيار الصف المطلوب للقيام بهذه العملية");
            return true;
        }
        return false;
    }
}
