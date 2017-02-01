/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Aaron
 */


public class BookDAOImpl implements BookDAO{
    private final Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     * 
     * @param book
     * @return 
     */
    @Override
    public Book save(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        return book;    
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        bookList = session.createCriteria(Book.class).list();
        return bookList;    
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean deleteAll() {
        boolean deleted = false;
        List<Book> deleteList = findAll();
        for(Book a : deleteList){
            session.delete(a);
        }
        deleted = true;
        session.getTransaction().commit();
        
        return deleted;  
    }
}
