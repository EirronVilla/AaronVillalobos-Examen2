/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface BookDAO {
    
    /**
     * 
     * @param book
     * @return 
     */
    public Book save(Book book);

    
    /**
     * 
     * @return 
     */
    public List<Book> findAll ();
    
    /**
     * 
     * @return 
     */
    public boolean deleteAll(); 
}
