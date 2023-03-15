package repositories;

import models.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserRepositoryImpl implements UserRepository{
    private EntityManager em;

    public UserRepositoryImpl(EntityManager em){
        this.em = em;
    }

    public User getUserById(int id){
        return em.find(User.class, id);
    }

    public User getUserByName(String username){
        TypedQuery<User> query = em.createQuery("SELECT u from User u WHERE u.username = : username", User.class);
        query.setParameter("username",username);
        return query.getSingleResult();
    }

    public User saveUser (User user){
        if(!em.contains(user)){
            em.persist(user);
        }
        else user = em.merge(user);
        return user;
    }

    public void updateUser( int id, String username, String password, String rol){
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
    }

    public void deleteUser(User user){
        if(em.contains(user)) {
            em.remove(user);
        } else {
            em.merge(user);
        }
    }
}
