package View;

import Presenter.PostasPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PostasView implements IPostasView {
    private JTextField textField1;
    private JTable table1;
    protected JFrame frame1;
    protected JPanel panel;
    private final PostasPresenter postasPresenter;

    public PostasView() {
        postasPresenter = new PostasPresenter(this);
        initComponents();
    }

    public JTextField getTextField1() {
        return textField1;
    }


    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    private void initComponents() {
        frame1 = new JFrame();
        panel = new JPanel();
        table1 = new JTable();
        viewColete();
        textField1 = new JTextField();
        JScrollPane scrollPane1 = new JScrollPane();
        postasPresenter.findColete();

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();

            //======== panel ========
            {
                {
                    scrollPane1.setViewportView(table1);
                }
                textField1.addActionListener(e -> postasPresenter.findColetById());
                GroupLayout panelLayout = new GroupLayout(panel);
                panel.setLayout(panelLayout);
                panelLayout.setHorizontalGroup(
                        panelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                );
                panelLayout.setVerticalGroup(
                        panelLayout.createParallelGroup()
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 50, Short.MAX_VALUE))
                );
            }

            GroupLayout frame1ContentPaneLayout = new GroupLayout(frame1ContentPane);
            frame1ContentPane.setLayout(frame1ContentPaneLayout);
            frame1ContentPaneLayout.setHorizontalGroup(
                    frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 23, Short.MAX_VALUE))
            );
            frame1ContentPaneLayout.setVerticalGroup(
                    frame1ContentPaneLayout.createParallelGroup()
                            .addGroup(frame1ContentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(18, Short.MAX_VALUE))
            );
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
            frame1.setVisible(true);
        }
    }

    protected void viewColete() {
        postasPresenter.findColete();
    }

    public void noColetFound() {
        JOptionPane.showMessageDialog(null, "Coletul cu numarul dat nu exista", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public void wrongNumber() {
        JOptionPane.showMessageDialog(null, "Incorrect Id. Please enter a number", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
