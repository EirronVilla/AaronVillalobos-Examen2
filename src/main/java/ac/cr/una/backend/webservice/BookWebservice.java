// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.dao.BookDAOImpl;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.service.BookService;
import ac.cr.una.backend.service.BookServiceImpl;
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

@Path("books")
public class BookWebservice {
    private BookDAO bookDAO;
    private BookService bookService;
    
    @Context
    private UriInfo context;
    
    @DELETE
    @Path("/")
    public boolean deleteAll(){
        boolean result;
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        
        result = bookService.deleteAll();
        return result;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book createBook(Book book){
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        
        book = bookService.save(book);
        return book;
    }
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Book> getAllBooks(){
        List<Book> booksList = null;
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        
        booksList = bookService.findAll();
        return booksList;
    }
    
    @GET
    @Path("/{totalPrice}")
    @Produces(MediaType.APPLICATION_JSON)
    public float getTotalPrice(){
        float totalPrice;
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        
        totalPrice = bookService.totalPriceAll();
        return totalPrice;
    }
}
