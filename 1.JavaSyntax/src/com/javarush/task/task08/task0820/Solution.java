package com.javarush.task.task08.task0820;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_SG;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> set1 = new HashSet<Dog>();
        set1.add(new Dog());
        set1.add(new Dog());
        set1.add(new Dog());

        return set1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> union = new HashSet<Object>();
        union.addAll(cats);
        union.addAll(dogs);

        return union;

    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object s : pets) {
            System.out.println(s);
        }

    }

    public static class Cat {
    }

    public static class Dog {
    }
}
