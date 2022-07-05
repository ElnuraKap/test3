package com.example.demo.models;

/**
 * @author Muhammed Toichubai
 */

public class Programmer {

    private String name;

    private Integer age;

    private String names;

    public Programmer() {
    }

    public Programmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
