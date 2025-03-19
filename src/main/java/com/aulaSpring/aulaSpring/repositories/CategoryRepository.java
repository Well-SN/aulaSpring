package com.aulaSpring.aulaSpring.repositories;

import com.aulaSpring.aulaSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
