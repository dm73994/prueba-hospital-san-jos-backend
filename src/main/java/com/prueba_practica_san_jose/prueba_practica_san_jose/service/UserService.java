package com.prueba_practica_san_jose.prueba_practica_san_jose.service;

import com.prueba_practica_san_jose.prueba_practica_san_jose.models.User;
import com.prueba_practica_san_jose.prueba_practica_san_jose.repositories.UserRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public User createNewUser(User newUser){
        return this.repo.save(newUser);
    }

    public List<User> listAllUsers(){
        return this.repo.findAll();
    }

    public Optional<User> consultUserById(Integer userId) throws ChangeSetPersister.NotFoundException {
        Optional<User> user = this.repo.findById(userId);
        return user;
    }

    public void updateUserData(User newUserData){
        this.repo.updateUserById(newUserData.getId(), newUserData.getName(), newUserData.getEmail());
    }

    public void deleteUser(Integer userId){
        this.repo.deleteById(userId);
    }
}
