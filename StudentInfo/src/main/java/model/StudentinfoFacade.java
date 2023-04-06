
package model;

import entites.Studentinfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mukesh
 */
@Stateless
public class StudentinfoFacade extends AbstractFacade<Studentinfo> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentinfoFacade() {
        super(Studentinfo.class);
    }

    public String Create(Studentinfo student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
