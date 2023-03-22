package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public interface IAdminView {

    void wrongRole();

    void changeId();

    void userExists();

    void noUserOrPass();

    JTable getUsers();

    void setUsers(JTable users);

    JTextField getTextField2();


    JTextField getTextField3() ;

    JTextField getTextField4() ;


}
