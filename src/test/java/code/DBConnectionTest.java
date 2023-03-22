package code;

import Model.DBConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

public class DBConnectionTest {

    private EntityManager em;
    @Test
    @DisplayName("Testing the session factory")
    void testConnection(){
        assertNotEquals(null,
                em = DBConnection.getEntityManager(),
                "Entiity manager should be generated if the database connection is set properly");
    }

    @RepeatedTest(1)
    void testMultipleConnection(){
        em = DBConnection.getEntityManager();
        assertEquals(em,DBConnection.getEntityManager(),"Entity manager should be the same for the whole app");
    }
}
