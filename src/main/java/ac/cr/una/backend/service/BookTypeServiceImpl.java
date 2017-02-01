// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.model.BookType;
import java.util.List;

/**
 *
 * @author Aaron
 */


public class BookTypeServiceImpl implements BookTypeService{
    private BookTypeDAO bookTypeDAO;

    public BookTypeServiceImpl() {
    }

    public BookTypeServiceImpl(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }

    public BookTypeDAO getBookTypeDAO() {
        return bookTypeDAO;
    }

    public void setBookTypeDAO(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }

    @Override
    public boolean deleteAll() {
        return bookTypeDAO.deleteAll();
    }

    @Override
    public BookType save(BookType type) {
        return bookTypeDAO.save(type);
    }

    @Override
    public BookType findByName(int id) {
        return bookTypeDAO.findByName(id);
    }
    
}
