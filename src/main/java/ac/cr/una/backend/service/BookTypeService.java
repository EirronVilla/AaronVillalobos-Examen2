// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.service;

import ac.cr.una.backend.model.BookType;
import java.util.List;

/**
 *
 * @author Aaron
 */


public interface BookTypeService {
    public boolean deleteAll();
    public BookType save(BookType type);
    public BookType findByName(int id);
}
