package br.com.igetecar.framework.business;

import br.com.igetecar.framework.persistence.DataAccessObject;
import br.com.igetecar.framework.persistence.DomainObject;

/**
 *
 * @author Rafael Quintino
 * @param <DO>
 * @param <DAO>
 */
public class DatabaseBusinessObject<DO extends DomainObject, DAO extends DataAccessObject<DO>> {

    protected DAO dao;

    public DatabaseBusinessObject(DAO dao) {
        this.dao = dao;
    }

}
