package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;

class PromoteComboBox extends JFrame {

    public PromoteComboBox(String title, String label, ComboBoxModel model,
            String button, GUI_Util.DoSomethingWithComboBox dswcb) {

        initComponents();
        jLabel.setText(label);
        jTitle_lbl.setText(title);
        jComboBox1.setModel(model);
        JFrame temp = this;
        jbutton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dswcb.doSomething((String) jComboBox1.getSelectedItem())) {
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
        jComboBox1 = new javax.swing.JComboBox<>();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTitle_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jComboBox1, 0, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jbutton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JButton jbutton;
    // End of variables declaration//GEN-END:variables
}
