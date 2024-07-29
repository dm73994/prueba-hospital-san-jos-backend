package com.prueba_practica_san_jose.prueba_practica_san_jose.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "loan_date")
    private LocalDate loanDate;

    @Column(name = "take_back_date")
    private LocalDate takeBackDate;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "book_id")
    private Integer book_id;

}
