package com.example.demo;

import com.example.demo.models.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Programmer muhammed = new Programmer("Muhammed", 25);
        System.out.println("Hello java 5");

    }

}
