package edu.greenriver.sdev.firstspring.controllers;

import edu.greenriver.sdev.firstspring.model.Book;
import edu.greenriver.sdev.firstspring.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class BookController {
    private BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return service.getEveryBook();
    }

    @GetMapping("books/random")
    public Book getRandomBook(){
        return service.random();
    }

    @GetMapping("books/by-name/{bookName}")
    public Book getBookByName(@PathVariable String bookName){
        return service.byName(bookName);
    }

    @GetMapping("books/by-pages/{pageTotal}")
    public List<Book> getLongerBookByPages(@PathVariable int pageTotal){
        return service.byPages(pageTotal);
    }
}
