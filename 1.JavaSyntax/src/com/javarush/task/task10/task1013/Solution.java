package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private int width;
        private int height;
        private boolean sex;
        private String job;

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age) {
            this.age = age;

        }

        public Human(int age, int width, int height) {
            this.age = age;
            this.width = width;
            this.height = height;
        }

        public Human(int age, String name, boolean sex, String job) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.job = job;
        }

        public Human(int height, boolean sex) {
            this.height = height;
            this.sex = sex;
        }

        public Human(int age, String name, int width, int height, boolean sex, String job) {
            this.age = age;
            this.name = name;
            this.width = width;
            this.height = height;
            this.sex = sex;
            this.job = job;
        }

        public Human(int age, String name, boolean sex) {
            this.age = age;
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, String name, String job) {
            this.age = age;
            this.name = name;
            this.job = job;
        }

        public Human(String name, boolean sex, String job) {
            this.name = name;
            this.sex = sex;
            this.job = job;
        }

        public Human(int age, String name, int height, String job) {
            this.age = age;
            this.name = name;
            this.height = height;
            this.job = job;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
