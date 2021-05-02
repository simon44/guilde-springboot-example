package eu.nickel.guildespringbootexample.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @Column(name = "title")
    private final String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(String title) {
        this.id = null;
        this.title = title;
    }

    public Book() {
        this.id = null;
        this.title = null;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
