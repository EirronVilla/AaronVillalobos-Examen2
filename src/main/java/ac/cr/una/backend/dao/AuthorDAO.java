/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Author;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface AuthorDAO {
    /**
     * 
     * @param id
     * @return 
     */
    public Author findByName (int id);
    
}
