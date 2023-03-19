package org.example;


import Model.Colet;
import Model.User;
import View.LoginView;

import javax.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        addUsers();
        addColete();
        new LoginView();
        System.out.println("Hello World!");
    }

    public static void addUsers() {
        User u = new User("octav", "123", "admin");
        User u1 = new User("postas", "123", "postas");
        User u2 = new User("coord", "1234", "coordonator");
        EntityManager em = DBConnection.getEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(u1);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(u2);
        em.getTransaction().commit();
    }

    public static void addColete() {
        Colet c1 = new Colet("Bucuresti", "Cluj-Napoca", Float.valueOf(31));
        Colet c2 = new Colet("Cluj-Napoca", "Bucuresti", Float.valueOf(66));
        Colet c3 = new Colet("Timisoara", "Craiova", Float.valueOf(25));
        EntityManager em = DBConnection.getEntityManager();
        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(c2);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(c3);
        em.getTransaction().commit();
    }
}