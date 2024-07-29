package com.prueba_practica_san_jose.prueba_practica_san_jose.service;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.Book;
import com.prueba_practica_san_jose.prueba_practica_san_jose.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo){
        this.repo = repo;
    }

    public Book createNewBook(Book newBook){
        return this.repo.save(newBook);
    }

    public List<Book> allBooks(){
        return this.repo.findAll();
    }

    public Book consultBookByTitle(String bookTitle){
        return this.repo.findByTitleContainingIgnoreCase(bookTitle);
    }

    public void deleteBook(Integer bookId){
        this.repo.deleteById(bookId);
    }
}
