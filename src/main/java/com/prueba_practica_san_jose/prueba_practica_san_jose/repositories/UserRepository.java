package com.prueba_practica_san_jose.prueba_practica_san_jose.repositories;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE User b SET b.name = :name, b.email = :email WHERE b.id = :id")
    void updateUserById(@Param("id") Integer id,
                        @Param("name") String title,
                        @Param("email") String author);
}
