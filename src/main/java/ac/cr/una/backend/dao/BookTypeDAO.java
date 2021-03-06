/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */

package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface BookTypeDAO {
    /**
     * 
     * @param id
     * @return 
     */
    public BookType findByName (int id);
    
    /**
     * 
     * @param booktype
     * @return 
     */
    public BookType save(BookType booktype);
    
    
    /**
     * 
     * @return 
     */
    public boolean deleteAll();
}
