package Model;

public interface UserRepository {
    User getUserById(int id);

    User getUserByName(String name);

    User saveUser(User user);

    void updateUser( int id, String username, String password, String rol);
    void deleteUser(User user);
}
