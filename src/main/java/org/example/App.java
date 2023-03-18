package org.example;

import Model.Colet;
import Model.User;
import View.LoginView;

import javax.persistence.EntityManager;

public class App
{
    public static void main( String[] args )
    {
//        SessionFactory sessionFactory;
//        sessionFactory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
        User u = new User("octav","123","admin");
        Colet c = new Colet("c","b",Float.valueOf(2));
        EntityManager em = DBConnection.getEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
       new LoginView();

        System.out.println( "Hello World!" );
    }
}
