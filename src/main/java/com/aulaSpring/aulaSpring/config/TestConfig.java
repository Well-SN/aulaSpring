package com.aulaSpring.aulaSpring.config;

import com.aulaSpring.aulaSpring.entities.Category;
import com.aulaSpring.aulaSpring.entities.Order;
import com.aulaSpring.aulaSpring.entities.Product;
import com.aulaSpring.aulaSpring.entities.User;
import com.aulaSpring.aulaSpring.entities.enums.OrderStatus;
import com.aulaSpring.aulaSpring.repositories.CategoryRepository;
import com.aulaSpring.aulaSpring.repositories.OrderRepository;
import com.aulaSpring.aulaSpring.repositories.ProductRepository;
import com.aulaSpring.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

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

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        ArrayList<Category> listCategory = new ArrayList<Category>();


        listCategory.add(cat1);
        listCategory.add(cat2);
        listCategory.add(cat3);



        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5,"");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        ArrayList<Product> listProduct = new ArrayList<Product>();

        p1.getCategory().add(cat2);
        p2.getCategory().add(cat1);
        p2.getCategory().add(cat3);
        p3.getCategory().add(cat3);
        p4.getCategory().add(cat3);
        p5.getCategory().add(cat2);

        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);
        listProduct.add(p4);
        listProduct.add(p5);

        categoryRepository.saveAll(listCategory);
        productRepository.saveAll(listProduct);



    }
}
