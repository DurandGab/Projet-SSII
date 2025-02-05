package ssii.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class ProjetRepositoryTest {
    @Autowired
    private ProjetRepository clientDao;


    @Test
    void daoExiste() {
        assertNotNull(clientDao);
    }
}
