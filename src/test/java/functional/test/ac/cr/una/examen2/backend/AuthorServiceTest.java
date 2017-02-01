package functional.test.ac.cr.una.examen2.backend;

import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorContactDAOImpl;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.dao.AuthorDAOImpl;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.service.AuthorService;
import ac.cr.una.backend.service.AuthorServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */


public class AuthorServiceTest {
    
    private AuthorDAO authorDAO;
    private AuthorService authorService;
    private AuthorContactDAO authorContactDAO;
    
    private AuthorContact contact = null;
    private Author author = null;
    
    public AuthorServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testingMethods(){
//        authorContactDAO = new AuthorContactDAOImpl();
//        authorDAO = new AuthorDAOImpl();
//        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
//        
//        author = new Author();
//        author.setIdAutor(5);
//        author.setName("William Shakespeare");
//        
//        contact = new AuthorContact();
//        contact.setId_author(author);
//        contact.setContact("www.jrrTolkien.com");
//        contact.setType("web page");
//        
//        contact = authorService.save(contact);
//        assertNotNull(contact.getId_authorContact());
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
