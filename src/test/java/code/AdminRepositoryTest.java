package code;

import Model.User;
import Model.UserRepository;
import Model.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AdminRepositoryTest {


    @Test
    public void testAdaugareUser(){

        UserRepository userRepository= new UserRepositoryImpl();
        User u = new User("Administrator","admin123","admin");
        User test = userRepository.saveUser(u);
        assertNotNull(test);
    }

    @Test
    public void testUpdateUser(){

        UserRepository userRepository= new UserRepositoryImpl();
        User u = new User("Administrator","admin123","admin");
        userRepository.saveUser(u);
        u.setUsername("Mihai");
        userRepository.updateUser(u);

       assertNull(userRepository.getUserByName("Administrator"));
       assertNotNull(userRepository.getUserByName("Mihai"));
    }

    @Test
    public void testDeleteUser(){

        UserRepository userRepository= new UserRepositoryImpl();
        User u = new User("Administrator","admin123","admin");
        userRepository.saveUser(u);
        assertTrue(userRepository.deleteUser(1));
        assertFalse(userRepository.deleteUser(1));
    }

    @Test
    public void testSearchUser(){

        UserRepository userRepository= new UserRepositoryImpl();
        User u = new User("Administrator","admin123","admin");
        userRepository.saveUser(u);

        assertNotNull(userRepository.getUserById(1));
        assertNull(userRepository.getUserById(2));
    }

    @Test
    public void testListaUsers(){

        UserRepository userRepository= new UserRepositoryImpl();
        User u = new User("Administrator","admin123","admin");
        User u1 = new User("Maria","abcde","postas");
        userRepository.saveUser(u);
        userRepository.saveUser(u1);
        List<User> users = userRepository.findAllUsers();

        assertNotNull(users);
        assertEquals(2,users.size());
        assertEquals(u, users.get(0));
        assertEquals(u1, users.get(1));
    }
}
