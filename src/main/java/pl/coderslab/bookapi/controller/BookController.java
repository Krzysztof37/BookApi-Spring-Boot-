package pl.coderslab.bookapi.controller;


import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.tags.form.ErrorsTag;
import pl.coderslab.bookapi.entity.Book;
import pl.coderslab.bookapi.utils.JpaBookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {


    JpaBookService jpaBookService;
    @Autowired
    public BookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;


    }

    @GetMapping("/books/getall")
    public String getBooks(Model model){
       List<Book> bookList = jpaBookService.getAll();
        model.addAttribute("bookList",bookList);


        return "booksview";
    }
    @GetMapping("/books/add")
    public String addBooks(Model model){
        model.addAttribute("book", new Book());

        return "addbook-form";
    }
    @PostMapping("/books/add")
    public String addBooksPost(@Valid Book book, BindingResult result){
        if (result.hasErrors()){

            return "addbook-form";
        }else {
            jpaBookService.addBook(book);
        }
        return "redirect:/books/getall";
        }

        @GetMapping("/books/delete/{id}")
    public String deleteBooks(@PathVariable Long id){
        jpaBookService.deleteBook(id);
    return "redirect:/books/getall";
        }

        @GetMapping("/books/update/{id}")
    public String updateBooks(@PathVariable Long id, Model model){
        Book book = jpaBookService.getBook(id);
        model.addAttribute("book", book);
        return "updatebook-form";
        }
        @PostMapping("/books/update/{id}")
    public String updateBooksPost(@Valid Book book, BindingResult result){
        if (result.hasErrors()){
            return "updatebook-form";
        }else{
            jpaBookService.updateBook(book);
        }
        return "redirect:/books/getall";
        }

        @GetMapping("/books/info/{id}")
    public String booksInfo(@PathVariable Long id, Model model){
        Book book = jpaBookService.getBook(id);
        model.addAttribute("book", book);
        return "bookinfoview";

        }

}
