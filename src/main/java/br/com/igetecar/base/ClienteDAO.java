package br.com.igetecar.base;

import br.com.igetecar.framework.persistence.DaoJpa2;
import br.com.igetecar.modelo.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author Jose Alves
 */
public class ClienteDAO extends DaoJpa2<Cliente>{

    public ClienteDAO(EntityManager entityManager) {
        super(Cliente.class, entityManager);
    }
    
}
