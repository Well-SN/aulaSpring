package com.aulaSpring.aulaSpring.services;

import com.aulaSpring.aulaSpring.entities.Order;
import com.aulaSpring.aulaSpring.entities.User;
import com.aulaSpring.aulaSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findID(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
