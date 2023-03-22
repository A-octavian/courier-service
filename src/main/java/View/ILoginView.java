package View;

import javax.swing.*;

public interface ILoginView {
    void noUser();

    void wrongPassword();

    void startAdmin();
    void startCoord();
    void startPostas();

    JTextField getTextField1();

    JPasswordField getPasswordField1();

}
