package Presenter;

import Model.User;
import Model.UserRepositoryImpl;
import View.*;

public class LoginPresenter {
    UserRepositoryImpl userRepository;
    ILoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.userRepository = new UserRepositoryImpl();
        this.loginView = loginView;
    }

    public void loginVerify() {
        String username = loginView.getTextField1().getText();
        String pass = new String(loginView.getPasswordField1().getPassword());
        User user = userRepository.getUserByName(username);
        if (user == null) {
            loginView.noUser();
            return;
        }
        if (user.getPassword().equals(pass)) {
            if (user.getRole().equals("admin")) {
                new AdminView();
                return;
            }
            if (user.getRole().equals("coordonator")) {
                new CoordView();
                return;
            }
            if (user.getRole().equals("postas")) {
                new PostasView();
            }
        } else loginView.wrongPassword();

    }
}
