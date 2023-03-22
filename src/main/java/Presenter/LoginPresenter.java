package Presenter;

import Model.User;
import Model.UserRepository;
import Model.UserRepositoryImpl;
import View.*;

public class LoginPresenter {
    UserRepository userRepository;
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
                loginView.startAdmin();
                return;
            }
            if (user.getRole().equals("coordonator")) {
                loginView.startCoord();
                return;
            }
            if (user.getRole().equals("postas")) {
                loginView.startPostas();
            }
        } else loginView.wrongPassword();

    }
}
