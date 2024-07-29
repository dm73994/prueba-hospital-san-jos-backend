package com.prueba_practica_san_jose.prueba_practica_san_jose.repositories;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByTitleContainingIgnoreCase(String bookTitle);
}
