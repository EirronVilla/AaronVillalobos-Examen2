/**
 * Segundo examen parcial
 * Programación III, Verano 2016 - 2017
 * Profesor Michael Guzman
 * Estudiante Aaron Villalobos Arguedas - 402300590
 */
package ac.cr.una.backend.model;

import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Aaron
 */

@Entity
@Table(name = "book", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_book")})
public class Book {
    private int id_book;
    private Author author;
    private BookType bookType;
    private String name;
    private Calendar dateRelease;
    private float price;

    /**
     * 
     */
    public Book() {
    }

    /**
     * 
     * @param id_book
     * @param author
     * @param bookType
     * @param name
     * @param dateRelease
     * @param price 
     */
    public Book(int id_book, Author author, BookType bookType, String name, Calendar dateRelease, float price) {
        this.id_book = id_book;
        this.author = author;
        this.bookType = bookType;
        this.name = name;
        this.dateRelease = dateRelease;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_book", unique = true, nullable = false)
    public int getId_book() {
        return id_book;
    }

    /**
     * 
     * @param id_book 
     */
    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    /**
     * 
     * @return 
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author", nullable = false)
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * @param author 
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return 
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type", nullable = false)
    public BookType getBookType() {
        return bookType;
    }

    /**
     * 
     * @param bookType 
     */
    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    /**
     * 
     * @return 
     */
    @Column(name = "name", unique = true, nullable = false)
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
    @Column(name = "dateRelease", unique = true, nullable = false)
    @Temporal(TemporalType.DATE)
    public Calendar getDateRelease() {
        return dateRelease;
    }

    /**
     * 
     * @param dateRelease 
     */
    public void setDateRelease(Calendar dateRelease) {
        this.dateRelease = dateRelease;
    }

    /**
     * 
     * @return 
     */
    @Column(name = "price", unique = true, nullable = false)
    public float getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id_book;
        hash = 71 * hash + Objects.hashCode(this.author);
        hash = 71 * hash + Objects.hashCode(this.bookType);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.dateRelease);
        hash = 71 * hash + Float.floatToIntBits(this.price);
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
        final Book other = (Book) obj;
        if (this.id_book != other.id_book) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.bookType, other.bookType)) {
            return false;
        }
        if (!Objects.equals(this.dateRelease, other.dateRelease)) {
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
        return "Book" +
               "{" + 
               "id_book=" + id_book + 
               ", author=" + author + 
               ", bookType=" + bookType + 
               ", name=" + name + 
               ", dateRelease=" + dateRelease + 
               ", price=" + price + 
               '}';
    }
    
    
}
