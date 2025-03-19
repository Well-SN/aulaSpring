package com.aulaSpring.aulaSpring.repositories;

import com.aulaSpring.aulaSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
