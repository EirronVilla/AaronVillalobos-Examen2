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
@Table(name = "bookType", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_type")})
public class BookType {
    private int id_type;
    private String type;

    /**
     * 
     */
    public BookType() {
    }

    /**
     * 
     * @param id_type
     * @param type 
     */
    public BookType(int id_type, String type) {
        this.id_type = id_type;
        this.type = type;
    }

    /**
     * 
     * @return 
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_type", unique = true, nullable = false)
    public int getId_type() {
        return id_type;
    }

    /**
     * 
     * @param id_type 
     */
    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    /**
     * 
     * @return 
     */
    @Column(name = "type", unique = true, nullable = false)
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id_type;
        hash = 83 * hash + Objects.hashCode(this.type);
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
        final BookType other = (BookType) obj;
        if (this.id_type != other.id_type) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "BookType{" + "id_type=" + id_type + ", type=" + type + '}';
    }
    
    
}
