// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.dao.BookTypeDAOImpl;
import ac.cr.una.backend.model.BookType;
import ac.cr.una.backend.service.BookTypeService;
import ac.cr.una.backend.service.BookTypeServiceImpl;
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

@Path("bookTypes")
public class BookTypeWebservice {
    private BookTypeDAO bookTypeDAO;
    private BookTypeService bookTypeService;
    
    @Context
    private UriInfo context;

    public BookTypeWebservice() {
    }
    
    @GET
    @Path("/{id_type}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookType getByName(@PathParam("id_type") int id){
        BookType type = null;
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        
        type = bookTypeService.findByName(id);
        return type;
    }
    
    @DELETE
    @Path("/")
    public boolean deleteAll(){
        boolean result;
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        
        result = bookTypeService.deleteAll();
        return result;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BookType createBookType(BookType bookType){
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        
        bookType = bookTypeService.save(bookType);
        return bookType;
    }
}
