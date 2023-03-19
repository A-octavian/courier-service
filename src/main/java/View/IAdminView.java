package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public interface IAdminView {
    public void changeId();
    void showUsers(DefaultTableModel model);

    void wrongRole();

    void wrongNumber();

    void userExists();

    void noUserOrPass();

    public JTable getUsers();

    public void setUsers(JTable users);

    public JTextField getTextField2();

    public void setTextField2(JTextField textField2) ;

    public JTextField getTextField3() ;

    public void setTextField3(JTextField textField3);

    public JTextField getTextField4() ;

    public void setTextField4(JTextField textField4);

}
