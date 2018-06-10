package br.com.igetecar.base;

import javax.persistence.EntityManager;

import br.com.igetecar.framework.persistence.DaoJpa2;
import br.com.igetecar.modelo.Produto;

public class ProdutoDAO extends DaoJpa2<Produto>{

	public ProdutoDAO(EntityManager entityManager) {
        super(Produto.class, entityManager);
    }
}
