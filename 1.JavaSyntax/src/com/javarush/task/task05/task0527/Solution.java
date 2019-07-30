package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dog = new Dog("Bob", 12, "Korgy");

        Cat cat = new Cat("Tom", "black", 12);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int weigh;
        String breed;

        public Dog(String name, int weigh, String breed) {
            this.name = name;
            this.weigh = weigh;
            this.breed = breed;
        }
    }

    public static class Cat {
        String name;
        String color;
        int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }
}
