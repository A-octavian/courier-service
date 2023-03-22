package Model;

import java.util.List;

public interface UserRepository {
    User getUserById(int id);

    User getUserByName(String name);

    List<User> findAllUsers();
    User saveUser(User user);

    void updateUser(User user);

    boolean deleteUser(int id);
}
