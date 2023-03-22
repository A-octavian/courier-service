package code;

import Model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ColetRepositoryTest {

    @Test
    public void testAdaugareColet(){

        ColetRepository coletRepository= new ColetRepositoryImpl();
        Colet c = new Colet("Craiova","Bucuresti",72.5F);
        Colet test = coletRepository.saveColet(c);
        assertNotNull(test);
    }

    @Test
    public void testUpdateColet(){

        ColetRepository coletRepository = new ColetRepositoryImpl();
        Colet c = new Colet("Bucuresti","Cluj-Napoca",88.1F);
        coletRepository.saveColet(c);
        c.setLocExp("Constanta");
        coletRepository.updateColet(c);

        assertNotEquals("Cluj-Napoca",coletRepository.getColetById(1).getLocExp());
        assertEquals("Constanta",coletRepository.getColetById(1).getLocExp());
    }

    @Test
    public void testDeleteColet(){

        ColetRepository coletRepository = new ColetRepositoryImpl();
        Colet c = new Colet("Bucuresti","Cluj-Napoca",88.1F);
        coletRepository.saveColet(c);
        assertTrue(coletRepository.deleteColet(1));
        assertFalse(coletRepository.deleteColet(1));
    }

    @Test
    public void testSearchColet(){

        ColetRepository coletRepository = new ColetRepositoryImpl();
        Colet c = new Colet("Bucuresti","Cluj-Napoca",88.1F);
        coletRepository.saveColet(c);

        assertEquals("Bucuresti",coletRepository.getColetById(1).getLocDest());
        assertEquals("Cluj-Napoca",coletRepository.getColetById(1).getLocExp());
        assertEquals(88.1F,coletRepository.getColetById(1).getValoare());

        assertNull(coletRepository.getColetById(2));
    }

    @Test
    public void testListaColete(){

        ColetRepository coletRepository = new ColetRepositoryImpl();
        Colet c = new Colet("Bucuresti","Cluj-Napoca",88.1F);
        Colet c1 = new Colet("Galati","Munchen",505.2F);
        coletRepository.saveColet(c);
        coletRepository.saveColet(c1);
        List<Colet> colete = coletRepository.findColete();

        assertNotNull(colete);
        assertEquals(2,colete.size());
        assertEquals(c, colete.get(0));
        assertEquals(c1, colete.get(1));
    }
}
