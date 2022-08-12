/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.Library;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author stefanini
 */
@Stateless
public class SpotifyFacade extends AbstractFacade<Library> {

    @PersistenceContext(unitName = "SpotifyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpotifyFacade() {
        super(Library.class);
    }
    
}
