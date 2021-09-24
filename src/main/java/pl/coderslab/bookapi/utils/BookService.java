package pl.coderslab.bookapi.utils;

import pl.coderslab.bookapi.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

     List<Book> getAll();
     Book addBook(Book book);
     Book getBook(Long id);
     void updateBook(Book book);
     void deleteBook(Long id);





}
