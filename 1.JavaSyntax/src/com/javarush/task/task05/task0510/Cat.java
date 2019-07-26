package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age = 10;
    private int weight = 10;
    private String address;
    private String color = "blue";


    public static void main(String[] args) {
    }

    public void initialize(String name) {
        this.name = name;
        this.age = 16;
        this.weight = 10;
        this.color = color;
    }

    public void initialize(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = 10;
        this.weight = 10;
        this.color = color;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
