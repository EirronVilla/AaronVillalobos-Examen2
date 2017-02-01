/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */

package ac.cr.una.backend.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Aaron
 */


public class HibernateUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() throws HibernateException {
        // Create the SessionFactory from hibernate.cfg.xml
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
    
}
