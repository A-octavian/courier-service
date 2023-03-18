package Model;

import org.example.DBConnection;

import javax.persistence.*;

public class UserRepositoryImpl implements UserRepository {
    private EntityManager em;

//    public UserRepositoryImpl(EntityManager em){
//        this.em = em;
//    }

    public UserRepositoryImpl(){
        em = DBConnection.getEntityManager();
    }
    public User getUserById(int id){

        return em.find(User.class, id);
    }

    public User getUserByName(String username){
        TypedQuery<User> query = em.createQuery("SELECT u from User u WHERE u.username = : username", User.class);
        query.setParameter("username",username);
        try {
            User u = query.getSingleResult();
            return u;
        }
        catch(NoResultException e){
            return null;
        }
    }

    public User saveUser (User user){
        em.getTransaction().begin();
        if(!em.contains(user)){
            em.persist(user);
        }
        else user = em.merge(user);
        em.getTransaction().commit();
        return user;
    }

    public void updateUser( int id, String username, String password, String rol){
        em.getTransaction().begin();
        User user = getUserById(id);
        if ( user == null){
            user = new User(id,username,password,rol);
            em.persist(user);
        } else {
            if (username != null){
                user.setUsername(username);
            }
            if( password != null){
                user.setPassword(password);
            }
            if(rol != null){
                user.setRole(rol);
            }
            em.merge(user);
        }
        em.getTransaction().commit();
    }

    public void deleteUser(User user){
        em.getTransaction().begin();
        if(em.contains(user)) {
            em.remove(user);
        } else {
            em.merge(user);
        }
        em.getTransaction().commit();
    }
}
