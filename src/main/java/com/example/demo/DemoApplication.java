package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        int i = 5;
        for(int j = 0; j < i; j++) {
            System.out.println("Dilbara's code");
        }

    }

}
