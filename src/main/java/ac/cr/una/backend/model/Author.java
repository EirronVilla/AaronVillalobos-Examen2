/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */

package ac.cr.una.backend.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Aaron
 */

@Entity
@Table(name = "author", catalog = "progra3_exa2", uniqueConstraints = {
@UniqueConstraint(columnNames = "id_author")})
public class Author {
    private int id_author;
    private String name;
    
    /*
    *
    */
    public Author(){
    }
    
    /**
     * 
     * @param id_author
     * @param name
     */
    public Author(int id_author, String name){
        this.id_author = id_author;
        this.name = name;
    }
    
    /**
     * 
     * @return
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_author", unique = true, nullable = false)
    public int getIdAutor(){
        return this.id_author;
    }
    
    /**
     *
     * @param id_author
     */
    public void setIdAutor(int id_author) {
        this.id_author = id_author;
    }

    /**
     * 
     * @return
     */
    @Column(name = "name", unique = false, nullable = false)
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *
     * @return
     */   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.id_author;
        hash = 73 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (this.id_author != other.id_author) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{" + "id_author=" + id_author + 
                ", name=" + name + '}';
    }
}
