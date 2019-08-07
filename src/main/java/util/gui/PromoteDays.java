package util.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;

class PromoteDays extends JFrame {

    public PromoteDays(String title, String label, String button,
            GUI_Util.DoSomethingWithDays dswd) {

        initComponents();
        jLabel.setText(label);
        jTitle_lbl.setText(title);
        JFrame temp = this;
        jbutton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dswd.doSomething(getDays())) {
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
        daysPnl = new javax.swing.JPanel();

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

        daysCB1.setText("Saturday");

        daysCB2.setText("Sunday");

        daysCB3.setText("Monday");

        daysCB4.setText("Tuesday");

        daysCB5.setText("Wednesday");

        daysCB6.setText("Thursday");

        daysCB7.setText("Friday");

        javax.swing.GroupLayout daysPnlLayout = new javax.swing.GroupLayout(daysPnl);
        daysPnl.setLayout(daysPnlLayout);
        daysPnlLayout.setHorizontalGroup(
            daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysPnlLayout.createSequentialGroup()
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daysPnlLayout.createSequentialGroup()
                        .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysCB2)
                            .addComponent(daysCB1)
                            .addComponent(daysCB3))
                        .addGap(22, 22, 22)
                        .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysCB6)
                            .addComponent(daysCB4)
                            .addComponent(daysCB5)))
                    .addGroup(daysPnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(daysCB7)))
                .addGap(0, 0, 0))
        );
        daysPnlLayout.setVerticalGroup(
            daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysPnlLayout.createSequentialGroup()
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB1)
                    .addComponent(daysCB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB2)
                    .addComponent(daysCB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB3)
                    .addComponent(daysCB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daysCB7)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel)
                        .addGap(18, 18, 18)
                        .addComponent(daysPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jTitle_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jbutton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(daysPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbutton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JCheckBox daysCB1 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB2 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB3 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB4 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB5 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB6 = new javax.swing.JCheckBox();
    public final javax.swing.JCheckBox daysCB7 = new javax.swing.JCheckBox();
    private javax.swing.JPanel daysPnl;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jTitle_lbl;
    private javax.swing.JButton jbutton;
    // End of variables declaration//GEN-END:variables

    private String getDays() {
        String days = "";
        if (daysCB1.isSelected()) {
            days += "Sa,";
        }
        if (daysCB2.isSelected()) {
            days += "Su,";
        }
        if (daysCB3.isSelected()) {
            days += "Mo,";
        }
        if (daysCB4.isSelected()) {
            days += "Tu,";
        }
        if (daysCB5.isSelected()) {
            days += "We,";
        }
        if (daysCB6.isSelected()) {
            days += "Th,";
        }
        if (daysCB7.isSelected()) {
            days += days.length() < 18 ? "Fr," : "Fr";
        }
        while (days.length() != 20) {
            days += days.length() < 18 ? "  ," : "  ";
        }
        return days;
    }
}
