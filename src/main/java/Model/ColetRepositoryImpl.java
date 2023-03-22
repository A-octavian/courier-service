package Model;

import javax.persistence.EntityManager;
import java.util.List;

public class ColetRepositoryImpl implements ColetRepository {
    private final EntityManager em;

    public ColetRepositoryImpl() {

        em = DBConnection.getEntityManager();
    }

    public List<Colet> findColete() {
        return em.createQuery("Select a FROM Colet a ORDER BY a.locDest ASC", Colet.class).getResultList();
    }

    public Colet getColetById(int id) {
        return em.find(Colet.class, id);
    }

    public Colet saveColet(Colet c) {
        em.getTransaction().begin();
        if (!em.contains(c)) {
            em.persist(c);
        } else c = em.merge(c);
        em.getTransaction().commit();
        return c;
    }

//    public void deleteColet(Colet c) {
//        em.getTransaction().begin();
//        if (em.contains(c)) {
//            em.remove(c);
//        } else em.merge(c);
//        em.getTransaction().commit();
//    }

    public boolean deleteColet(int id) {
        Colet colet = getColetById(id);
        if(colet == null) return false;
        em.getTransaction().begin();
        em.remove(colet);
        em.getTransaction().commit();
        return true;
    }

//    public void updateColet(int id, String locDest, String locExp, Float valoare) {
//        em.getTransaction().begin();
//        Colet c = getColetById(id);
//        if (c == null) {
//            c = new Colet(id, locDest, locExp, valoare);
//            em.persist(c);
//        } else {
//            if (locDest != null)
//                c.setLocDest(locDest);
//            if (locExp != null)
//                c.setLocExp(locExp);
//            if (valoare != null)
//                c.setValoare(valoare);
//            em.merge(c);
//        }
//        em.getTransaction().commit();
//    }

    public void updateColet(Colet c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }

}
