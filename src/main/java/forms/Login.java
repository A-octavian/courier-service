/*
 * Created by JFormDesigner on Sat Mar 18 13:43:18 EET 2023
 */

package forms;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author aocta
 */
public class Login {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Octavian
        frame1 = new JFrame();
        LoginPanel = new JPanel();
        textField1 = new JTextField();
        Login = new JLabel();
        label1 = new JLabel();
        passwordField1 = new JPasswordField();
        label2 = new JLabel();
        button1 = new JButton();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();

            //======== LoginPanel ========
            {
                LoginPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
                EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
                . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
                java. awt. Color. red) ,LoginPanel. getBorder( )) ); LoginPanel. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
                { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
                throw new RuntimeException( ); }} );

                //---- Login ----
                Login.setText("Login");

                //---- label1 ----
                label1.setText("Username");

                //---- label2 ----
                label2.setText("Password");

                //---- button1 ----
                button1.setText("Login");

                GroupLayout LoginPanelLayout = new GroupLayout(LoginPanel);
                LoginPanel.setLayout(LoginPanelLayout);
                LoginPanelLayout.setHorizontalGroup(
                    LoginPanelLayout.createParallelGroup()
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(LoginPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                    .addComponent(Login)
                                    .addGap(136, 136, 136))
                                .addGroup(GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                    .addGroup(LoginPanelLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(label1))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(LoginPanelLayout.createParallelGroup()
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField1))
                                    .addGap(97, 97, 97))))
                        .addGroup(GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addGap(116, 116, 116))
                );
                LoginPanelLayout.setVerticalGroup(
                    LoginPanelLayout.createParallelGroup()
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Login)
                            .addGap(18, 18, 18)
                            .addGroup(LoginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label1))
                            .addGap(32, 32, 32)
                            .addGroup(LoginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(43, 43, 43)
                            .addComponent(button1)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, frame1ContentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LoginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                frame1ContentPaneLayout.createParallelGroup()
                    .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                        .addComponent(LoginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Octavian
    private JFrame frame1;
    private JPanel LoginPanel;
    private JTextField textField1;
    private JLabel Login;
    private JLabel label1;
    private JPasswordField passwordField1;
    private JLabel label2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
