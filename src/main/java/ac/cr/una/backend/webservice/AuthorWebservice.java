// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorContactDAOImpl;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.dao.AuthorDAOImpl;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.service.AuthorService;
import ac.cr.una.backend.service.AuthorServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
/**
 *
 * @author Aaron
 */

@Path("authors")
public class AuthorWebservice {
    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;
    private AuthorService authorService;
    
    @Context
    private UriInfo context;

    
    public AuthorWebservice() {
    }
    
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)    
    public List<AuthorContact> getAllAuthors(){
        List<AuthorContact> contactsList = null;
        authorDAO = new AuthorDAOImpl();
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
        
        contactsList = authorService.findAll();
        return contactsList;
    }
    
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Author getAuthorByName(@PathParam("name") String id){
        Author author = null;
        authorDAO = new AuthorDAOImpl();
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
        
        author = authorService.findAuthorByName(id);
        return author;
    }
    
    @DELETE
    @Path("/")
    public boolean deleteAll(){
        boolean result;
        authorDAO = new AuthorDAOImpl();
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
        
        result = authorService.deleteAll();
        return result;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AuthorContact createAuthor(AuthorContact authorContact){
        authorDAO = new AuthorDAOImpl();
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
        
        authorContact = authorService.save(authorContact);
        return authorContact;
    }
    
}
