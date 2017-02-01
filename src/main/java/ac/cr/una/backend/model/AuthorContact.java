/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Aaron
 */

@Entity
@Table(name = "authorContact", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_authorContact")})
public class AuthorContact{

    private int id_authorContact;
    private Author id_author;
    private String contact;
    private String type;

    /**
     * 
     */
    public AuthorContact() {
    }

    /**
     * 
     * @param id_authorContact
     * @param id_author
     * @param contact
     * @param type 
     */
    public AuthorContact(int id_authorContact, Author id_author, String contact, String type) {
        this.id_authorContact = id_authorContact;
        this.id_author = id_author;
        this.contact = contact;
        this.type = type;
    }

    /**
     * 
     * @return 
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_authorContact", unique = true, nullable = false)
    public int getId_authorContact() {
        return id_authorContact;
    }

    /**
     * 
     * @param id_authorContact 
     */
    public void setId_authorContact(int id_authorContact) {
        this.id_authorContact = id_authorContact;
    }

    /**
     * 
     * @return 
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author", nullable = false)
    public Author getId_author() {
        return id_author;
    }

    /**
     *
     * @param id_author
     */
    public void setId_author(Author id_author) {
        this.id_author = id_author;
    }

    /**
     *
     * @return
     */
    @Column(name = "contact", unique = true, nullable = false)
    public String getContact() {
        return contact;
    }

    /**
     *
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
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
        int hash = 3;
        hash = 53 * hash + this.id_authorContact;
        hash = 53 * hash + Objects.hashCode(this.id_author);
        hash = 53 * hash + Objects.hashCode(this.contact);
        hash = 53 * hash + Objects.hashCode(this.type);
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
        final AuthorContact other = (AuthorContact) obj;
        if (this.id_authorContact != other.id_authorContact) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.id_author, other.id_author)) {
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
        return "AuthorContact" +
                "{" + 
                "id_authorContact=" + id_authorContact + 
                ", id_author=" + id_author + 
                ", contact=" + contact + 
                ", type=" + type + 
                '}';
    }    
}
