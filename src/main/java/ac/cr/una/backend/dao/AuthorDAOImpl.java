/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Author;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Aaron
 */


public class AuthorDAOImpl implements AuthorDAO {
    
    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public Author findByName(int id) {
        Author author = null;
        Query query = session.createQuery("from author where id_author = :id ");
        query.setParameter("id", id);

        if (query.list().size() > 0) {
            author = (Author) query.list().get(0);
        }

        return author;    
    }
    
}
