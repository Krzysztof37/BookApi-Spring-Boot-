package pl.coderslab.bookapi.entity;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@RequiredArgsConstructor
@Table(name = "books")
@Data
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 100, message = "isbn: zbyt duzy/maly rozmiar")
    @NotBlank(message = "isbn: wypelnij pole")
    private String isbn;
    @Size(min = 2,max = 70, message = "title: zbyt duzy/maly rozmiar")
    @NotBlank (message = "title: wypelnij pole")
    private String title;
    @Size(min=2, max = 30, message = "author: zbyt duzy/maly rozmiar")
    @NotBlank(message = "author: wypelnij pole")
    private String author;
    @Size(min=2,max=50, message = "publisher: zbyt duzy/maly rozmiar")
    @NotBlank(message = "publisher: wypelnij pole")
    private String publisher;
    @Size(max=40, message = "type: zbyt duzy/maly rozmiar")
    private String type;






}
