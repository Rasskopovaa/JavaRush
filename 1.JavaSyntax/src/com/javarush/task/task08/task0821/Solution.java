package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Аленова", "Алена");
        map.put("Аленова", "Игорь");
        map.put("Jkjk", "Алена");
        map.put("Иfffв", "Игорь");
        map.put("Аggfова", "Алена");
        map.put("Игdgfев", "Игорь");
        map.put("Алdfва", "Алена");
        map.put("Игоsddsв", "Игорь");
        map.put("Аsdва", "Алена");
        map.put("Игfdев", "Игорь");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}