package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man = new Man("Bob", 35, "MonteCarlo 23");
        Man man01 = new Man("Charly", 34, "Street 56");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man01.name + " " + man01.age + " " + man01.address);


        Woman woman = new Woman("Lili", 34, "Wolker street 123/4");
        Woman woman01 = new Woman("Djen", 35, "Street of Pancakes");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman01.name + " " + woman01.age + " " + woman01.address);


    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
