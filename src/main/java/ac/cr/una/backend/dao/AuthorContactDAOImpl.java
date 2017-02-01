/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Aaron
 */


public class AuthorContactDAOImpl implements AuthorContactDAO{

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     * 
     * @param authorcontact
     * @return 
     */
    @Override
    public AuthorContact save(AuthorContact authorcontact) {
        
        session.beginTransaction();
        session.save(authorcontact);
        session.getTransaction().commit();
        
        return authorcontact;
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<AuthorContact> findAll() {  
        
        List<AuthorContact> authorcontactList = new ArrayList<>();
        authorcontactList = session.createCriteria(AuthorContact.class).list();
   
        return authorcontactList;
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public boolean delete(int id) {
        
        boolean isDeleted = false;
        AuthorContact contact = null;
        session.beginTransaction();
        contact = (AuthorContact) session.get(AuthorContact.class, id);
        session.delete(contact);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public boolean deleteAll(){
        boolean deleted = false;
        List<AuthorContact> deleteList = findAll();
        for(AuthorContact a : deleteList){
            session.delete(a);
        }
        deleted = true;
        session.getTransaction().commit();
        
        return deleted;
    }
    
}
