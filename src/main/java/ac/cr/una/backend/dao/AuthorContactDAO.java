/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */

package ac.cr.una.backend.dao;


import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface AuthorContactDAO {
    
    public AuthorContact save(AuthorContact authorcontact);
    
    /**
     * 
     * @return 
     */
    public List<AuthorContact> findAll ();
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean delete(int id);
    
    /**
     * 
     * @return 
     */
    public boolean deleteAll();
    
}
