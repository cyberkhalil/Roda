package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;
import util.gui.GUI_Util.DoSomethingWithTextAndSpinner;

class PromoteTextAreaAndSpinner extends JFrame {

    public PromoteTextAreaAndSpinner(String title, String jtextArea_lbl, String jSpinner_lbl,
            SpinnerNumberModel spinnerNumberModel,
            String jButton_lbl, DoSomethingWithTextAndSpinner dswcbas) {

        initComponents();
        jTitle_lbl.setText(title);
        jTextArea_lbl.setText(jtextArea_lbl);
        jspinner_lbl.setText(jSpinner_lbl);
        jSpinner.setModel(spinnerNumberModel);
        JFrame temp = this;
        jButton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (jSpinner.getModel().getValue().getClass().getSimpleName()) {
                    case "Double":
                        if (dswcbas.doSomething(jTextArea1.getText(),
                                (double) jSpinner.getValue())) {
                            temp.dispose();
                        }
                        break;
//                    case "Integer":
                    default:
                        if (dswcbas.doSomething(jTextArea1.getText(), (int) jSpinner.getValue())) {
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

        jTextArea_lbl = new javax.swing.JLabel();
        jTitle_lbl = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jSpinner = new javax.swing.JSpinner();
        jspinner_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        setResizable(false);

        jTextArea_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jTextArea_lbl.setText("Example New Example :");

        jTitle_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTitle_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jTitle_lbl.setText("Change Example Example");

        jButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton.setForeground(new java.awt.Color(0, 51, 153));
        jButton.setText("Set Example");

        jspinner_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jspinner_lbl.setForeground(new java.awt.Color(0, 51, 153));
        jspinner_lbl.setText("Example New Example :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspinner_lbl)
                            .addComponent(jTextArea_lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jTitle_lbl)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspinner_lbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextArea_lbl)))
                .addGap(18, 18, 18)
                .addComponent(jButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jTextArea_lbl;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JLabel jspinner_lbl;
    // End of variables declaration//GEN-END:variables
}
