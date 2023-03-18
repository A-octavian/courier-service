package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;

public class DBConnection {
    private static DBConnection single_db = null;
    public EntityManager entityManager;
    private  DBConnection() {
        SessionFactory sessionFactory;
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try{
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static EntityManager getEntityManager() {
        if( single_db == null)
           single_db =  new DBConnection();
        return single_db.entityManager;
    }

}
