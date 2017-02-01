/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */

package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Aaron
 */


public class BookTypeDAOImpl implements BookTypeDAO {
    private final Session session = HibernateUtil.getSessionFactory().openSession();


    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public BookType findByName(int id) {
        BookType Type = null;
        Query query = session.createQuery("from bookType where id_type = :id ");
        query.setParameter("id", id);

        if (query.list().size() > 0) {
            Type = (BookType) query.list().get(0);
        }

        return Type;    
    }

    /**
     * 
     * @param type
     * @return 
     */
    @Override
    public BookType save(BookType type) {
        session.beginTransaction();
        session.save(type);
        session.getTransaction().commit();

        return type;    
    }

 
    /**
     * 
     * @return 
     */
    
    public List<BookType> findAll() {
        List<BookType> typeslist = new ArrayList<>();

        typeslist = session.createCriteria(BookType.class).list();

        return typeslist;    
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean deleteAll() {
        boolean deleted = false;
        List<BookType> deleteList = new ArrayList<>();
        deleteList = session.createCriteria(BookType.class).list();
        for(BookType a : deleteList){
            session.delete(a);
        }
        deleted = true;
        session.getTransaction().commit();
        
        return deleted;  
    }
    
}
