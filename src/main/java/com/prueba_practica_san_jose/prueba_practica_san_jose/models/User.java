package com.prueba_practica_san_jose.prueba_practica_san_jose.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private String email;
}
