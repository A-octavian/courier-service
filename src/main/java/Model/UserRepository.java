package Model;

public interface UserRepository {
    User getUserById(int id);

    User getUserByName(String name);

    User saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
