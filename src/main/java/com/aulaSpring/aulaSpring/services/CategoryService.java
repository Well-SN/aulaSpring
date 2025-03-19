package com.aulaSpring.aulaSpring.services;

import com.aulaSpring.aulaSpring.entities.Category;
import com.aulaSpring.aulaSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findID(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
