package pl.coderslab.bookapi.utils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.bookapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Book b set b.isbn = ?1, b.title = ?2,b.author = ?3, b.publisher = ?4, b.type = ?5 WHERE b.id = ?6")
    int updateQuery(String isbn,String title,String author,String publisher,String type,Long id);


}
