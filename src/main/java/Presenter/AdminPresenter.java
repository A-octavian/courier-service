package Presenter;

import Model.User;
import Model.UserRepositoryImpl;
import View.AdminView;
import View.IAdminView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class AdminPresenter {
    UserRepositoryImpl userRepository;
    IAdminView adminView;

    public AdminPresenter(AdminView adminView) {
        userRepository = new UserRepositoryImpl();
        this.adminView = adminView;
    }

    public void findAllUsers() {
        List<User> users = userRepository.findAllUsers();
        String[] col = {"ID", "Username", "Parola", "Rol"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], col);
        for (User u : users) {
            Object[] o = new Object[4];
            o[0] = u.getId();
            o[1] = u.getUsername();
            o[2] = u.getPassword();
            o[3] = u.getRole();
            model.addRow(o);
        }
        JTable t = adminView.getUsers();
        t.setModel(model);
        adminView.setUsers(t);
    }

    public void addUser() {
        String name = adminView.getTextField2().getText();
        String password = adminView.getTextField3().getText();
        String role = adminView.getTextField4().getText();
        if (name.equals("") || password.equals("")) {
            adminView.noUserOrPass();
            return;
        }

        if (!role.equals("admin"))
            if (!role.equals("coordonator"))
                if (!role.equals("postas")) {
                    adminView.wrongRole();
                    return;
                }

        User user = new User(name, password, role);
        User a = userRepository.getUserByName(user.getUsername());

        if (a != null) {
            adminView.userExists();
            return;
        }
        User u = userRepository.saveUser(user);
        findAllUsers();
    }

    public void deleteUser() {
        JTable table = adminView.getUsers();
        int row, value;
        row = table.getSelectedRow();
        value = (Integer) table.getModel().getValueAt(row, 0);
        userRepository.deleteUser(value);
        findAllUsers();
    }

    public void updateUser() {
        JTable table = adminView.getUsers();
        int row, id;
        row = table.getSelectedRow();
        String username, pass, role;
        try {
            if (table.getModel().getValueAt(row, 0).getClass() == String.class)
                id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
            else id = (int) table.getModel().getValueAt(row, 0);
        }
        catch(NumberFormatException e){
            adminView.changeId();
            findAllUsers();
            return;
        }
        username = (String) table.getModel().getValueAt(row, 1);
        pass = (String) table.getModel().getValueAt(row, 2);
        role = (String) table.getModel().getValueAt(row, 3);

        if (!role.equals("admin"))
            if (!role.equals("coordonator"))
                if (!role.equals("postas")) {
                    adminView.wrongRole();
                    findAllUsers();
                    return;
                }
        if (username.equals("") || pass.equals("")) {
            adminView.noUserOrPass();
            findAllUsers();
            return;
        }
        User user = userRepository.getUserById(id);
        if (user == null) {
            findAllUsers();
            return;
        }
        user.setUsername(username);
        user.setPassword(pass);
        user.setRole(role);
        userRepository.updateUser(user);
        findAllUsers();
    }
}
