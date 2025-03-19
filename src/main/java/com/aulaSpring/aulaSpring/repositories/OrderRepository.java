package com.aulaSpring.aulaSpring.repositories;

import com.aulaSpring.aulaSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
