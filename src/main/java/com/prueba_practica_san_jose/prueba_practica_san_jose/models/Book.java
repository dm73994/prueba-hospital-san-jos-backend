package com.prueba_practica_san_jose.prueba_practica_san_jose.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;

    @Column(name = "release_date")
    private LocalDate releaseDate;
}
