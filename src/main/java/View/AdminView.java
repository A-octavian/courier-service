package View;

import Presenter.AdminPresenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminView implements IAdminView {
    AdminPresenter adminPresenter = new AdminPresenter(this);
    private JFrame frame1;
    private JPanel AdminPanel;
    private JScrollPane scrollPane1;
    private JTable users;
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

    public AdminView() {
        initComponents();
    }

    public JTable getUsers() {
        return users;
    }

    public void setUsers(JTable users) {
        this.users = users;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    private void initComponents() {
        frame1 = new JFrame();
        AdminPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        users = new JTable();
        adminPresenter.findAllUsers();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        {
            var frame1ContentPane = frame1.getContentPane();

            {

                {
                    scrollPane1.setViewportView(users);
                }


                label2.setText("Username");

                label3.setText("Password");

                label4.setText("Role");

                button1.setText("Add");
                button2.setText("Delete");
                button3.setText("Update");

                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        adminPresenter.addUser();
                    }
                });

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       adminPresenter.deleteUser();
                    }
                });

                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        adminPresenter.updateUser();
                    }
                });

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
                                                                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(44, 44, 44)
                                                                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
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
            frame1.setVisible(true);
        }
    }

    public void changeId(){
        JOptionPane.showMessageDialog(null, "ID cannot be changed", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void wrongNumber() {
        JOptionPane.showMessageDialog(null, "Incorrect Id. Please enter a number", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showUsers(DefaultTableModel model) {
        users.setModel(model);
    }

    public void wrongRole() {
        JOptionPane.showMessageDialog(null, "Wrong Role Value", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void noUserOrPass() {
        JOptionPane.showMessageDialog(null, "Username or password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void userExists() {
        JOptionPane.showMessageDialog(null, "User already exists", "Error", JOptionPane.ERROR_MESSAGE);
    }

}

