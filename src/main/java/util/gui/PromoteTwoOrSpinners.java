package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

class PromoteTwoOrSpinners extends JFrame {

    public PromoteTwoOrSpinners(String title, String spinner1LblTxt,
            SpinnerNumberModel spinner1Model, String spinner2LblTxt,
            SpinnerNumberModel spinner2Model, String toggleTextON, String toggleTextOFF,
            String buttonTxt, GUI_Util.DoSomethingWithTwoOrSpinners dswtos) {

        initComponents();
        jTitle_lbl.setText(title);
        jspinner1_lbl.setText(spinner1LblTxt);
        jSpinner1.setModel(spinner1Model);
        jspinner2_lbl.setText(spinner2LblTxt);
        jSpinner2.setModel(spinner2Model);
        jToggleButton.setText(toggleTextON);
        jToggleButton.addActionListener((event) -> {
            jToggleButton.setText(jToggleButton.isSelected() ? toggleTextON : toggleTextOFF);
            jspinner1_lbl.setEnabled(jToggleButton.isSelected());
            jSpinner1.setEnabled(jToggleButton.isSelected());
            jspinner2_lbl.setEnabled(!jToggleButton.isSelected());
            jSpinner2.setEnabled(!jToggleButton.isSelected());
        });
        JFrame temp = this;
        jButton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (jSpinner1.getModel().getValue().getClass().getSimpleName()) {
                    case "Double":
                        if (dswtos.doSomething(jToggleButton.isSelected(),
                                jToggleButton.isSelected() ? (double) jSpinner1.getValue()
                                : (double) jSpinner2.getValue())) {
                            temp.dispose();
                        }
                        break;
//                    case "Integer":
                    default:
                        if (dswtos.doSomething(jToggleButton.isSelected(),
                                jToggleButton.isSelected() ? (int) jSpinner1.getValue()
                                : (int) jSpinner2.getValue())) {
                            temp.dispose();
                        }
                }
            }
        });
        jButton.setText(buttonTxt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitle_lbl = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jspinner1_lbl = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jspinner2_lbl = new javax.swing.JLabel();
        jToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jTitle_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTitle_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jTitle_lbl.setText("Change Example Example");

        jButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 51, 153));
        jButton.setText("Set Example");

        jspinner1_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jspinner1_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jspinner1_lbl.setText("Example New Example :");

        jSpinner2.setEnabled(false);

        jspinner2_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jspinner2_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jspinner2_lbl.setText("Example New Example :");
        jspinner2_lbl.setEnabled(false);

        jToggleButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButton.setForeground(new java.awt.Color(0, 51, 153));
        jToggleButton.setSelected(true);
        jToggleButton.setText("Toggle Text Example");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jspinner2_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jspinner1_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTitle_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jToggleButton)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspinner1_lbl)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspinner2_lbl)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JToggleButton jToggleButton;
    private javax.swing.JLabel jspinner1_lbl;
    private javax.swing.JLabel jspinner2_lbl;
    // End of variables declaration//GEN-END:variables
}
