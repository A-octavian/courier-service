package Presenter;

import Model.User;
import Model.UserRepositoryImpl;
import View.AdminView;
import View.CoordView;
import View.LoginView;
import View.PostasView;

public class LoginPresenter {
    UserRepositoryImpl userRepository;
    LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.userRepository = new UserRepositoryImpl();
        this.loginView = loginView;
    }

    public void loginVerify(String username, String pass){
        User user = userRepository.getUserByName(username);
        if( user == null) {
            loginView.noUser();
            return;
        }
        if ( user.getPassword().equals(pass)) {
            if (user.getRole().equals("admin")) {
                new AdminView();
                return;
            }
            if (user.getRole().equals("coord")) {
                new CoordView();
                return;
            }
            if (user.getRole().equals("postas")) {
                new PostasView();
            }
        }
        else loginView.wrongPassword();

    }
}
