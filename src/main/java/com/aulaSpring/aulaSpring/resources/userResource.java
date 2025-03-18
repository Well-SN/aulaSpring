package com.aulaSpring.aulaSpring.resources;

import com.aulaSpring.aulaSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping(value="/users")
public class userResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Well", "Well@teste", "114234","TESTE");
        return ResponseEntity.ok().body(u);
    }
}
