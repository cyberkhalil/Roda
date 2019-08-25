package util.gui;

import java.io.IOException;
import javax.swing.JOptionPane;
import util.gui.GUI_Util.UpdateTableOperation;

class DisplayItemsInJTable extends javax.swing.JFrame {

    private final UpdateTableOperation updateTableOperation;

    public DisplayItemsInJTable(GUI_Util.UpdateTableOperation uto) {
        initComponents();
        uto.updateTable(itemsTbl);
        this.updateTableOperation = uto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemsViewSPnl = new javax.swing.JScrollPane();
        itemsTbl = new javax.swing.JTable();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        toolsPnl = new javax.swing.JPanel();
        printTableBtn = new javax.swing.JButton();
        refreshTableBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        itemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itemsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        itemsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTblMouseClicked(evt);
            }
        });
        itemsViewSPnl.setViewportView(itemsTbl);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Everest Training center");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        printTableBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        printTableBtn.setText("Print Table");
        printTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTableBtnActionPerformed(evt);
            }
        });

        refreshTableBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        refreshTableBtn.setText("Refresh Table");
        refreshTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolsPnlLayout = new javax.swing.GroupLayout(toolsPnl);
        toolsPnl.setLayout(toolsPnlLayout);
        toolsPnlLayout.setHorizontalGroup(
            toolsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(printTableBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshTableBtn)
                .addGap(20, 20, 20))
        );
        toolsPnlLayout.setVerticalGroup(
            toolsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolsPnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(toolsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printTableBtn)
                    .addComponent(refreshTableBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemsViewSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolsPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(toolsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(itemsViewSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTblMouseClicked
        updateTableOperation.updateTable(itemsTbl);
    }//GEN-LAST:event_itemsTblMouseClicked

    private void refreshTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableBtnActionPerformed
        updateTableOperation.updateTable(itemsTbl);
    }//GEN-LAST:event_refreshTableBtnActionPerformed

    private void printTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTableBtnActionPerformed
        // TODO print excel file
        try {
            JSystemFileChooser f = new JSystemFileChooser();
            f.setFileSelectionMode(JSystemFileChooser.FILES_ONLY);
            f.showSaveDialog(rootPane);
            if (f.getSelectedFile() == null) {
                return;
            }
            GUI_Util.writeToExcell(itemsTbl, f.getSelectedFile().getPath());
            JOptionPane.showMessageDialog(rootPane, "تمت الطباعة بنجاح");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "لقد حدث خطأ أثناء عملية الطباعة");
        }
    }//GEN-LAST:event_printTableBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgLbl;
    private javax.swing.JTable itemsTbl;
    private javax.swing.JScrollPane itemsViewSPnl;
    private javax.swing.JButton printTableBtn;
    private javax.swing.JButton refreshTableBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JPanel toolsPnl;
    // End of variables declaration//GEN-END:variables

}
