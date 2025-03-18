package com.aulaSpring.aulaSpring.config;

import com.aulaSpring.aulaSpring.entities.User;
import com.aulaSpring.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Well","Well@teste","11966317893","TESTE#");
        User u2 = new User(null,"Palloma","Palloma@teste","11966317893","PAlL#");

        ArrayList<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);

        userRepository.saveAll(list);
    }
}
