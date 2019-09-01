package util.gui;

class PromotSelectionTable extends javax.swing.JFrame {

    final GUI_Util.DoSomethingWithTable dswt;

    public PromotSelectionTable(javax.swing.table.TableModel dtm, String titleTxt, String tipTxt,
            String buttonTxt, GUI_Util.DoSomethingWithTable dswt) {
        initComponents();
        itemsTbl.setModel(dtm);
//        itemsTbl.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        title_lbl.setText(titleTxt);
        action_btn.setText(buttonTxt);
        tip_lbl.setText(tipTxt);
        this.dswt = dswt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemsViewSPnl = new javax.swing.JScrollPane();
        itemsTbl = new javax.swing.JTable();
        title_lbl = new javax.swing.JLabel();
        tip_lbl = new javax.swing.JLabel();
        action_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        itemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itemsTbl.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        itemsViewSPnl.setViewportView(itemsTbl);

        title_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(0, 51, 153));
        title_lbl.setText("Change Example Example");

        tip_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tip_lbl.setForeground(new java.awt.Color(0, 51, 153));
        tip_lbl.setText("Change Example Example text");

        action_btn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        action_btn.setText("example Btn");
        action_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemsViewSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tip_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(title_lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(action_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title_lbl)
                .addGap(15, 15, 15)
                .addComponent(tip_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemsViewSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(action_btn)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void action_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_btnActionPerformed
        if (dswt.doSomthing(itemsTbl)) {
            this.dispose();
        }
    }//GEN-LAST:event_action_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton action_btn;
    private javax.swing.JTable itemsTbl;
    private javax.swing.JScrollPane itemsViewSPnl;
    private javax.swing.JLabel tip_lbl;
    private javax.swing.JLabel title_lbl;
    // End of variables declaration//GEN-END:variables

}
