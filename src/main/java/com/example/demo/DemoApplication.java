package com.example.demo;

import com.example.demo.models.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("Hello java 5");
        
        System.out.println("nargiza");
        
        System.out.println("mkdslfklds");
        
        System.out.println("Nasgiza's conflict");
        
        System.out.println("dewklj");



        int i = 9;
        for(int j = 0; j < i; j++) {
            System.out.println("Dilbara's code");
        }

        System.out.println("hello ,how are you?");

        System.out.println("mukhammed");

        ArrayList<Programmer> arrayList = new ArrayList<>();

      arrayList.add(new Programmer());

      arrayList.add(new Programmer("Muhammed",25));


        System.out.println("DILBARA");
        System.out.println("Hello,how are you?");
    }


}
