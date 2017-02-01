// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface BookService {
    
    public boolean deleteAll();
    public Book save(Book book);
    public List<Book> findAll();
    public float totalPriceAll();
    
}
