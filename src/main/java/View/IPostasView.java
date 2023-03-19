package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public interface IPostasView {

    void wrongNumber();

    public void noColetFound();
    public JTextField getTextField1();

    public JTable getTable1() ;

    public void setTable1(JTable table1) ;
}
