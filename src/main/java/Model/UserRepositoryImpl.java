package Model;

import org.example.DBConnection;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final EntityManager em;

    public UserRepositoryImpl() {
        em = DBConnection.getEntityManager();
    }

    public List<User> findAllUsers() {
        return em.createQuery("Select a FROM User a", User.class).getResultList();
    }

    public User getUserById(int id) {

        return em.find(User.class, id);
    }

    public User getUserByName(String username) {
        TypedQuery<User> query = em.createQuery("SELECT u from User u WHERE u.username = : username", User.class);
        query.setParameter("username", username);
        try {
            User u = query.getSingleResult();
            return u;
        } catch (NoResultException e) {
            return null;
        }
    }

    public User saveUser(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return user;
    }

    public void updateUser(User user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }


    public void deleteUser(int id) {
        em.getTransaction().begin();
        User user = getUserById(id);
        em.remove(user);
        em.getTransaction().commit();
    }
}
