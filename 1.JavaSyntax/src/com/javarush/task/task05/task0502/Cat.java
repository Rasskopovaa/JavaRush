package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {

    }

    public boolean fight(Cat anotherCat) {

        if (this.age + weight * strength > anotherCat.age + weight * strength)
            return true;
        else if (this.age + weight * strength == anotherCat.age + weight * strength)
            return false;
        else
            return false;

    }
}
