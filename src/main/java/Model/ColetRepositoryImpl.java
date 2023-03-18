package Model;

import org.example.DBConnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ColetRepositoryImpl implements ColetRepository {
    @PersistenceContext
    private EntityManager em;
//    public ColetRepositoryImpl(EntityManager em){
//        this.em = em;
//    }

    public ColetRepositoryImpl() {

        em = DBConnection.getEntityManager();
    }

    public Colet getColetById(int id){
        return em.find(Colet.class,id);
    }
    public Colet saveColet(Colet c){
        em.getTransaction().begin();
        if(!em.contains(c)){
            em.persist(c);
        }
        else c = em.merge(c);
        em.getTransaction().commit();
        return c;
    }
    public void deleteColet(Colet c){
        em.getTransaction().begin();
        if( em.contains(c)){
            em.remove(c);
        }
        else em.merge(c);
        em.getTransaction().commit();
    }
    public void updateColet(int id, String locDest, String locExp, Float valoare){
        em.getTransaction().begin();
        Colet c = getColetById(id);
        if( c == null){
            c = new Colet(id,locDest,locExp,valoare);
            em.persist(c);
        }
        else {
            if(locDest != null)
                c.setLocDest(locDest);
            if(locExp != null)
                c.setLocExp(locExp);
            if(valoare != null)
                c.setValoare(valoare);
            em.merge(c);
        }
        em.getTransaction().commit();
    }
}
