package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext())
            cats.remove(iterator.next());
        //напишите тут ваш код. step 3 - пункт 3


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> list = new HashSet<Cat>();
        list.add(new Cat());
        list.add(new Cat());
        list.add(new Cat());


        return list;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats) {
            System.out.println(c);
        }

    }

    // step 1 - пункт 1
    public static class Cat {
    }
}
