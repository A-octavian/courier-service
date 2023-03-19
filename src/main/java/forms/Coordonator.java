/*
 * Created by JFormDesigner on Sun Mar 19 00:08:26 EET 2023
 */

package forms;

import javax.swing.*;

/**
 * @author aocta
 */
public class Coordonator {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Octavian
    private JFrame frame;
    private JPanel AdminPanel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public Coordonator() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Octavian
        frame = new JFrame();
        AdminPanel = new JPanel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== frame ========
        {
            var frameContentPane = frame.getContentPane();

            //======== AdminPanel ========
            {
                AdminPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
                        (0, 0, 0, 0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax.swing.border.TitledBorder.CENTER, javax.swing.border
                        .TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog", java.awt.Font.BOLD, 12), java.awt
                        .Color.red), AdminPanel.getBorder()));
                AdminPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                    @Override
                    public void
                    propertyChange(java.beans.PropertyChangeEvent e) {
                        if ("\u0062ord\u0065r".equals(e.getPropertyName())) throw new RuntimeException()
                                ;
                    }
                });

                //---- label2 ----
                label2.setText("Locatie Destinatie");

                //---- label3 ----
                label3.setText("Locatie Provenienta");

                //---- label4 ----
                label4.setText("Valoare");

                //---- button1 ----
                button1.setText("Add");

                //---- button2 ----
                button2.setText("Delete");

                //---- button3 ----
                button3.setText("Update");

                GroupLayout AdminPanelLayout = new GroupLayout(AdminPanel);
                AdminPanel.setLayout(AdminPanelLayout);
                AdminPanelLayout.setHorizontalGroup(
                        AdminPanelLayout.createParallelGroup()
                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addComponent(textField2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textField4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(button1)))
                                                        .addGap(0, 348, Short.MAX_VALUE)))
                                        .addContainerGap())
                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addGap(534, 534, 534)
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(93, Short.MAX_VALUE))
                );
                AdminPanelLayout.setVerticalGroup(
                        AdminPanelLayout.createParallelGroup()
                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(162, 162, 162)
                                                        .addComponent(button2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(button3)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label2))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button1)
                                                        .addGap(6, 6, 6))
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(387, 387, 387)
                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label3))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label4))
                                        .addGap(14, 14, 14))
                );
            }

            GroupLayout frameContentPaneLayout = new GroupLayout(frameContentPane);
            frameContentPane.setLayout(frameContentPaneLayout);
            frameContentPaneLayout.setHorizontalGroup(
                    frameContentPaneLayout.createParallelGroup()
                            .addGroup(frameContentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(AdminPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(66, Short.MAX_VALUE))
            );
            frameContentPaneLayout.setVerticalGroup(
                    frameContentPaneLayout.createParallelGroup()
                            .addGroup(frameContentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            frame.pack();
            frame.setLocationRelativeTo(frame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
