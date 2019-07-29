package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 33;
        this.color = "blue";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 22;
        this.color = "green";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 12;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 12;
    }

    public static void main(String[] args) {

    }
}
