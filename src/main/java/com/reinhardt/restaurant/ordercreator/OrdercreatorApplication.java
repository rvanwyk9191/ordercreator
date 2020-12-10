package com.reinhardt.restaurant.ordercreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.reinhardt.security.domain"})
@EnableJpaRepositories(basePackages = "com.reinhardt.security.repository")
@ComponentScan(basePackages = {
        "com.reinhardt.restaurant.ordercreator",
        "com.reinhardt.security"
})
public class OrdercreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdercreatorApplication.class, args);
    }

}
