package View;

import Presenter.LoginPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView implements ILoginView {
    private LoginPresenter loginPresenter ;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public LoginView() {
        loginPresenter = new LoginPresenter(this);
        initComponents();
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    private void initComponents() {
        JFrame frame1 = new JFrame();
        JPanel loginPanel = new JPanel();
        textField1 = new JTextField();
        JLabel login = new JLabel();
        JLabel label1 = new JLabel();
        passwordField1 = new JPasswordField();
        JLabel label2 = new JLabel();
        JButton button1 = new JButton();

        {
            var frame1ContentPane = frame1.getContentPane();

            {
                login.setText("Login");

                label1.setText("Username");

                label2.setText("Password");

                button1.setText("Login");
                button1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        loginPresenter.loginVerify();
                    }
                });

                GroupLayout LoginPanelLayout = new GroupLayout(loginPanel);
                loginPanel.setLayout(LoginPanelLayout);
                LoginPanelLayout.setHorizontalGroup(
                        LoginPanelLayout.createParallelGroup()
                                .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(LoginPanelLayout.createParallelGroup()
                                                .addGroup(GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                                        .addComponent(login)
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
                                        .addComponent(login)
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
                                    .addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                    frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                    .addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 8, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
            frame1.setVisible(true);
        }
    }

    public void startAdmin(){
        new AdminView();
    }
    public void startCoord(){
        new CoordView();
    }
    public void startPostas(){
        new PostasView();
    }

    public void noUser() {
        JOptionPane.showMessageDialog(null, "No user with this name found", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void wrongPassword() {
        JOptionPane.showMessageDialog(null, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
