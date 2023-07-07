
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_App");
    
    public List<Produto> obterTodosRegistros() {
        EntityManager em = emf.createEntityManager();
        List<Produto> result = em.createQuery("SELECT e FROM APP e").getResultList();
        em.close();
        return result;
        
    }
}
