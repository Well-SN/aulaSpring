package com.aulaSpring.aulaSpring.services;

import com.aulaSpring.aulaSpring.entities.Product;
import com.aulaSpring.aulaSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findID(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

}
