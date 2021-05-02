package eu.nickel.guildespringbootexample.book;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private final int id;

    @Column(name = "title")
    private final String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book() {
        this.id = -1;
        this.title = null;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
