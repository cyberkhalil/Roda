package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

class PromoteComboBoxAndSpinner extends JFrame {

    public PromoteComboBoxAndSpinner(String title, String jCombo_lbl, ComboBoxModel model,
            String jSpinner_lbl, SpinnerNumberModel spinnerNumberModel,
            String jButton_lbl, GUI_Util.DoSomethingWithComboBoxAndSpinner dswcbas) {

        initComponents();
        jTitle_lbl.setText(title);
        jcombo_lbl.setText(jCombo_lbl);
        jComboBox.setModel(model);
        jspinner_lbl.setText(jSpinner_lbl);
        jSpinner.setModel(spinnerNumberModel);
        JFrame temp = this;
        jButton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (jSpinner.getModel().getValue().getClass().getSimpleName()) {
                    case "Double":
                        if (dswcbas.doSomething((String) jComboBox.getSelectedItem(),
                                (double) jSpinner.getValue())) {
                            temp.dispose();
                        }
                        break;
//                    case "Integer":
                    default:
                        if (dswcbas.doSomething((String) jComboBox.getSelectedItem(),
                                (int) jSpinner.getValue())) {
                            temp.dispose();
                        }
                }
            }
        });
        jButton.setText(jButton_lbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcombo_lbl = new javax.swing.JLabel();
        jTitle_lbl = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jSpinner = new javax.swing.JSpinner();
        jspinner_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        setResizable(false);

        jcombo_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcombo_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jcombo_lbl.setText("Example New Example :");

        jTitle_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTitle_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jTitle_lbl.setText("Change Example Example");

        jButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 51, 153));
        jButton.setText("Set Example");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jspinner_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jspinner_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jspinner_lbl.setText("Example New Example :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitle_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jspinner_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcombo_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombo_lbl)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspinner_lbl)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JLabel jcombo_lbl;
    private javax.swing.JLabel jspinner_lbl;
    // End of variables declaration//GEN-END:variables
}
