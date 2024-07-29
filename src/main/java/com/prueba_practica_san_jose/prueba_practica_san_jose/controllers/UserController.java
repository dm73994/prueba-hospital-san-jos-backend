package com.prueba_practica_san_jose.prueba_practica_san_jose.controllers;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.Book;
import com.prueba_practica_san_jose.prueba_practica_san_jose.models.User;
import com.prueba_practica_san_jose.prueba_practica_san_jose.service.BookService;
import com.prueba_practica_san_jose.prueba_practica_san_jose.service.UserService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<User> createBook(@RequestBody User newUser){
        User user = this.service.createNewUser(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> listUsers(){
        return new ResponseEntity<>(this.service.listAllUsers(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findUser(@PathVariable Integer id) throws ChangeSetPersister.NotFoundException {
        return new ResponseEntity<>(this.service.consultUserById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping
    public void updateUser(@RequestBody User newUserData){
        this.service.updateUserData(newUserData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBook(@PathVariable Integer id){
        this.service.deleteUser(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
