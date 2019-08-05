package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);
        list.add("Home");
        list.add("Cat");
        list.add("Dog");
        list.add("Mouse");
        list.add("Minni");

        System.out.println(list.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
    }
}
