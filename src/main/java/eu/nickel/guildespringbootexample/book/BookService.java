package eu.nickel.guildespringbootexample.book;

import eu.nickel.guildespringbootexample.book.payload.BookPayload;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getById(int id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Book create(BookPayload bookPayload) {
        Book book = new Book(bookPayload.getTitle());
        return bookRepository.save(book);
    }

    public Book update(int id, BookPayload bookPayload) {
        bookRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Book book = new Book(id, bookPayload.getTitle());
        return bookRepository.save(book);
    }

    public void delete(int id) {
        Book book = bookRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        bookRepository.delete(book);
    }
}
