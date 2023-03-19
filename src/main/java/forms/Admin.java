import javax.swing.*;
///*
// * Created by JFormDesigner on Sat Mar 18 17:13:47 EET 2023
// */
//
//package forms;
//
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.GroupLayout;
//import org.jdesktop.layout.GroupLayout;
//
//public class Admin {
//
//    private void initComponents() {
//        frame1 = new JFrame();
//        AdminPanel = new JPanel();
//        scrollPane1 = new JScrollPane();
//        users = new JTable();
//
//        {
//            var frame1ContentPane = frame1.getContentPane();
//
//            {
//
//                {
//                    scrollPane1.setViewportView(users);
//                }
//
//                GroupLayout AdminPanelLayout = new GroupLayout(AdminPanel);
//                AdminPanel.setLayout(AdminPanelLayout);
//                AdminPanelLayout.setHorizontalGroup(
//                    AdminPanelLayout.createParallelGroup()
//                        .addGroup(AdminPanelLayout.createSequentialGroup()
//                            .addGap(17, 17, 17)
//                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
//                            .addContainerGap(409, Short.MAX_VALUE))
//                );
//                AdminPanelLayout.setVerticalGroup(
//                    AdminPanelLayout.createParallelGroup()
//                        .addGroup(AdminPanelLayout.createSequentialGroup()
//                            .addGap(99, 99, 99)
//                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
//                            .addContainerGap(360, Short.MAX_VALUE))
//                );
//            }
//
//            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
//            frame1ContentPane.setLayout(frame1ContentPaneLayout);
//            frame1ContentPaneLayout.setHorizontalGroup(
//                frame1ContentPaneLayout.createParallelGroup()
//                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
//                        .addComponent(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addContainerGap())
//            );
//            frame1ContentPaneLayout.setVerticalGroup(
//                frame1ContentPaneLayout.createParallelGroup()
//                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
//                        .addComponent(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addContainerGap())
//            );
//            frame1.pack();
//            frame1.setLocationRelativeTo(frame1.getOwner());
//        }
//    }
//
//
//    private JFrame frame1;
//    private JPanel AdminPanel;
//    private JScrollPane scrollPane1;
//    private JTable users;
//
//
//    private void initComponents() {
//        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
//        // Generated using JFormDesigner Evaluation license - Octavian
//        frame1 = new JFrame();
//        AdminPanel = new JPanel();
//        scrollPane1 = new JScrollPane();
//        users = new JTable();
//
//        //======== frame1 ========
//        {
//            Container frame1ContentPane = frame1.getContentPane();
//
//            //======== AdminPanel ========
//            {
//                AdminPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
//                0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
//                .BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.
//                red),AdminPanel. getBorder()));AdminPanel. addPropertyChangeListener(new java.beans.PropertyChangeListener(){ public void propertyChange(java.
//                beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}});
//
//                //======== scrollPane1 ========
//                {
//                    scrollPane1.setViewportView(users);
//                }
//
//                GroupLayout AdminPanelLayout = new GroupLayout(AdminPanel);
//                AdminPanel.setLayout(AdminPanelLayout);
//                AdminPanelLayout.setHorizontalGroup(
//                    AdminPanelLayout.createParallelGroup()
//                        .add(AdminPanelLayout.createSequentialGroup()
//                            .add(17, 17, 17)
//                            .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
//                            .addContainerGap(409, Short.MAX_VALUE))
//                );
//                AdminPanelLayout.setVerticalGroup(
//                    AdminPanelLayout.createParallelGroup()
//                        .add(AdminPanelLayout.createSequentialGroup()
//                            .add(99, 99, 99)
//                            .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
//                            .addContainerGap(360, Short.MAX_VALUE))
//                );
//            }
//
//            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
//            frame1ContentPane.setLayout(frame1ContentPaneLayout);
//            frame1ContentPaneLayout.setHorizontalGroup(
//                frame1ContentPaneLayout.createParallelGroup()
//                    .add(frame1ContentPaneLayout.createSequentialGroup()
//                        .add(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addContainerGap())
//            );
//            frame1ContentPaneLayout.setVerticalGroup(
//                frame1ContentPaneLayout.createParallelGroup()
//                    .add(frame1ContentPaneLayout.createSequentialGroup()
//                        .add(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addContainerGap())
//            );
//            frame1.pack();
//            frame1.setLocationRelativeTo(frame1.getOwner());
//        }
//        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
//    }
//
//    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
//    // Generated using JFormDesigner Evaluation license - Octavian
//    private JFrame frame1;
//    private JPanel AdminPanel;
//    private JScrollPane scrollPane1;
//    private JTable users;
//    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
//}

public class Admin {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Octavian
    private JFrame frame1;
    private JPanel AdminPanel;
    private JScrollPane scrollPane1;
    private JTable users;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Octavian
        frame1 = new JFrame();
        AdminPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        users = new JTable();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();

            //======== AdminPanel ========
            {
                AdminPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
                        .EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax.swing.border.TitledBorder.CENTER, javax
                        .swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dia\u006cog", java.awt.Font.BOLD,
                        12), java.awt.Color.red), AdminPanel.getBorder()));
                AdminPanel.addPropertyChangeListener(new java.beans
                        .PropertyChangeListener() {
                    @Override
                    public void propertyChange(java.beans.PropertyChangeEvent e) {
                        if ("bord\u0065r".equals(e.
                                getPropertyName())) throw new RuntimeException();
                    }
                });

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(users);
                }

                //---- label1 ----
                label1.setText("Id");

                //---- label2 ----
                label2.setText("Username");

                //---- label3 ----
                label3.setText("Password");

                //---- label4 ----
                label4.setText("Role");

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
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(47, 47, 47)
                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(button2, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(44, 44, 44)
                                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(label1)
                                                                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                                                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(150, 150, 150)
                                                                        .addComponent(button1)))))
                                        .addContainerGap(254, Short.MAX_VALUE))
                );
                AdminPanelLayout.setVerticalGroup(
                        AdminPanelLayout.createParallelGroup()
                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addComponent(button2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(button3)))
                                        .addGap(29, 29, 29)
                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label1))
                                        .addGroup(AdminPanelLayout.createParallelGroup()
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(label2)))
                                                .addGroup(AdminPanelLayout.createSequentialGroup()
                                                        .addGap(44, 44, 44)
                                                        .addComponent(button1)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label3))
                                        .addGap(18, 18, 18)
                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label4))
                                        .addContainerGap(236, Short.MAX_VALUE))
                );
            }

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                    frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                    .addComponent(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            frame1ContentPaneLayout.setVerticalGroup(
                    frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                    .addComponent(AdminPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
