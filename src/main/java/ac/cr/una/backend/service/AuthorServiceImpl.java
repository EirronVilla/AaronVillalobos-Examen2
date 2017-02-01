// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Aaron
 */


public class AuthorServiceImpl implements AuthorService{
    private AuthorDAO authorDAO;
    private AuthorContactDAO contactDAO;

    
    
    public AuthorServiceImpl() {
    }
    
    

    public AuthorServiceImpl(AuthorDAO authorDAO, AuthorContactDAO contactDAO) {
        this.authorDAO = authorDAO;
        this.contactDAO = contactDAO;
    }

    public AuthorContactDAO getContactDAO() {
        return contactDAO;
    }

    public void setContactDAO(AuthorContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }


    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    @Override
    public boolean deleteAll() {
        return contactDAO.deleteAll();
    }

    @Override
    public AuthorContact save(AuthorContact authorContact) {
        return contactDAO.save(authorContact);
    }

    @Override
    public List<AuthorContact> findAll() {
        return contactDAO.findAll();
    }

    @Override
    public Author findAuthorByName(int id) {
        return authorDAO.findByName(id);
    }
    
}
