package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> list = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            list.add("Лилия " + i);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
