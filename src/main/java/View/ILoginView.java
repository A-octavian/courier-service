package View;

import javax.swing.*;

public interface ILoginView {
    void noUser();

    void wrongPassword();

    public JTextField getTextField1();

    public void setTextField1(JTextField textField1);

    public JPasswordField getPasswordField1();

    public void setPasswordField1(JPasswordField passwordField1);
}
