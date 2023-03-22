package View;

import Presenter.CoordPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoordView extends PostasView implements ICoordView {
    CoordPresenter coordPresenter ;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    public CoordView() {
        super();
        coordPresenter = new CoordPresenter(this);
        initComponents();
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public JTable getTable(){
        return super.getTable1();
    }


    private void initComponents() {
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        {
            var frameContentPane = super.frame1.getContentPane();
            {

                label2.setText("Locatie Destinatie");

                label3.setText("Locatie Provenienta");

                label4.setText("Valoare");

                button1.setText("Add");

                button2.setText("Delete");

                button3.setText("Update");
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        coordPresenter.addColet();
                    }
                });

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        coordPresenter.deleteColet();
                    }
                });
                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        coordPresenter.updateColet();
                    }
                });


                GroupLayout AdminPanelLayout = new GroupLayout(super.panel);
                super.panel.setLayout(AdminPanelLayout);
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
                                    .addComponent(super.panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(66, Short.MAX_VALUE))
            );
            frameContentPaneLayout.setVerticalGroup(
                    frameContentPaneLayout.createParallelGroup()
                            .addGroup(frameContentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(super.panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            frame1.setVisible(true);
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

    }

    public void emptyFields() {
        JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void viewColete() {
        super.viewColete();
    }

    public void noValue() {
        JOptionPane.showMessageDialog(null, "Valoare must be a number", "Error", JOptionPane.ERROR_MESSAGE);
    }


}
