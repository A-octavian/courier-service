package repositories;

import models.Colet;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class ColetRepositoryImpl implements ColetRepository {
    private EntityManager em;
    public ColetRepositoryImpl(EntityManager em){
        this.em = em;
    }
    public Colet getColetById(int id){
        return em.find(Colet.class,id);
    }
    public Colet saveColet(Colet c){
        if(!em.contains(c)){
            em.persist(c);
        }
        else c = em.merge(c);
        return c;
    }
    public void deleteColet(Colet c){
        if( em.contains(c)){
            em.remove(c);
        }
        else em.merge(c);
    }
    public void updateColet(int id, String locDest, String locExp, Float valoare){
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
    }
}
