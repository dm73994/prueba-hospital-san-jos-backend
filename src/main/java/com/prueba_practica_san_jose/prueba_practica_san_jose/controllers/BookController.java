package com.prueba_practica_san_jose.prueba_practica_san_jose.controllers;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.Book;
import com.prueba_practica_san_jose.prueba_practica_san_jose.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book newBook){
        Book book = this.service.createNewBook(newBook);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable Integer id){
        this.service.deleteBook(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping
    public List<Book> allBooks(){
        return this.service.allBooks();
    }

}
