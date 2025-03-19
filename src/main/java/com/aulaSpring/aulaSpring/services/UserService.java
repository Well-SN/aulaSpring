package com.aulaSpring.aulaSpring.services;

import com.aulaSpring.aulaSpring.entities.User;
import com.aulaSpring.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findALL(){
        return repository.findAll();
    }


    public User findID(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }


}
