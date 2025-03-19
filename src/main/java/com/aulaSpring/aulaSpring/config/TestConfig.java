package com.aulaSpring.aulaSpring.config;

import com.aulaSpring.aulaSpring.entities.Order;
import com.aulaSpring.aulaSpring.entities.User;
import com.aulaSpring.aulaSpring.entities.enums.OrderStatus;
import com.aulaSpring.aulaSpring.repositories.OrderRepository;
import com.aulaSpring.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Well","Well@teste","11966317893","TESTE#");
        User u2 = new User(null,"Palloma","Palloma@teste","11966317893","PAlL#");

        ArrayList<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);

        userRepository.saveAll(list);


        Order o1 = new Order(null, Instant.parse("2025-03-20T19:53:07Z"), OrderStatus.DELEVERED ,u1);
        Order o2 = new Order(null, Instant.parse("2025-02-21T03:42:10Z"), OrderStatus.PAID,u2);
        Order o3 = new Order(null, Instant.parse("2025-01-22T15:21:22Z"), OrderStatus.CANCELED, u1);

        ArrayList<Order> listOrder = new ArrayList<Order>();
        listOrder.add(o1);
        listOrder.add(o2);
        listOrder.add(o3);

        orderRepository.saveAll(listOrder);
    }
}
