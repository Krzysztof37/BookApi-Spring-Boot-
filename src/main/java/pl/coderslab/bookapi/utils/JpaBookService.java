package pl.coderslab.bookapi.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.bookapi.entity.Book;

import java.util.List;
import java.util.Optional;

@Data
public class JpaBookService implements BookService {

public JpaBookService(){}

    @Autowired
    BookRepository bookRepository;




    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    public Book getBook(Long id) {
        Book book = bookRepository.getById(id);
        return book;
    }

    @Override
    public void updateBook(Book book) {
    bookRepository.updateQuery(book.getIsbn(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getType(),book.getId());
    }

    @Override
    public void deleteBook(Long id) {
        Book book = bookRepository.getById(id);
        bookRepository.delete(book);
    }
}
