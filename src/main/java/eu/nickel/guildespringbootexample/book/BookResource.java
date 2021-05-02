package eu.nickel.guildespringbootexample.book;

import eu.nickel.guildespringbootexample.book.payload.BookPayload;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    Book getById(@PathVariable int id) {
        return bookService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@Valid @RequestBody BookPayload bookPayload) {
        return bookService.create(bookPayload);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable int id,
                       @Valid @RequestBody BookPayload bookPayload) {
        return bookService.update(id, bookPayload);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        bookService.delete(id);
    }
}
