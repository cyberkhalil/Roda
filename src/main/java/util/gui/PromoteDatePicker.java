package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;

class PromoteDatePicker extends JFrame {

    public PromoteDatePicker(String title, String label,
            String button, GUI_Util.DoSomethingWithDatePicker dswdp) {

        initComponents();
        jLabel.setText(label);
        jTitle_lbl.setText(title);
        JFrame temp = this;
        jbutton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dswdp.doSomething(jXDatePicker1.getDate().getTime())) {
                    temp.dispose();
                }
            }
        });
        jbutton.setText(button);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jTitle_lbl = new javax.swing.JLabel();
        jbutton = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 51, 153));
        jLabel.setText("Example New Example :");

        jTitle_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTitle_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jTitle_lbl.setText("Change Example Example");

        jbutton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbutton.setForeground(new java.awt.Color(0, 51, 153));
        jbutton.setText("Set Example");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTitle_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jbutton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jTitle_lbl;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton jbutton;
    // End of variables declaration//GEN-END:variables
}
