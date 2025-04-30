package com.diego.resourttour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(exclude = {
	    org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
	    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
	})
@RestController
public class ResortTourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResortTourApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
