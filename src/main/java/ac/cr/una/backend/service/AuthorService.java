// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface AuthorService {
    
    public boolean deleteAll();
    public AuthorContact save(AuthorContact authorContact);
    public List<AuthorContact> findAll();
    public Author findAuthorByName(int id);
    
    
}
