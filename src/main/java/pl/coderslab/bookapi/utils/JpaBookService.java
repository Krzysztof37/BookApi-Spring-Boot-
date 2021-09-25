package pl.coderslab.bookapi.utils;

import org.springframework.stereotype.Service;
import pl.coderslab.bookapi.entity.Book;

import java.util.List;


@Service
public class JpaBookService implements BookService {

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


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
