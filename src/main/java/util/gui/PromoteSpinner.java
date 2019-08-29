package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

class PromoteSpinner extends JFrame {

    public PromoteSpinner(String title, String label, SpinnerNumberModel spinnerNumberModel,
            String button, GUI_Util.DoSomethingWithSpinner dsws) {

        initComponents();
        jLabel.setText(label);
        jTitle_lbl.setText(title);
        spinner.setModel(spinnerNumberModel);
        JFrame temp = this;
        jbutton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (spinner.getModel().getValue().getClass().getSimpleName()) {
                    case "Double":
                        if (dsws.doSomething((double) spinner.getValue())) {
                            temp.dispose();
                        }
                        break;
//                    case "Integer":
                    default:
                        if (dsws.doSomething((int) spinner.getValue())) {
                            temp.dispose();
                        }
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
        spinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Price");

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
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbutton)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTitle_lbl)
                        .addGap(61, 61, 61)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbutton)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JButton jbutton;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
