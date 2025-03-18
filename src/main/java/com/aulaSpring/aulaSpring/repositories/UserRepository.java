package com.aulaSpring.aulaSpring.repositories;

import com.aulaSpring.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
