package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Олеговfv", "Олег");
        map.put("Алинова", "Алина");
        map.put("Олеговs", "Эльдар");
        map.put("Настевна", "Настя");
        map.put("Игорев", "Костя");
        map.put("Лолев", "Лолик");
        map.put("Кеков", "Кекик");
        map.put("Сидорова", "Настя");
        map.put("Олегов", "Влад");
        map.put("Куков ", "Лоло");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String a : map.values()) {
            if (a.equals(name))
                count++;
        }
        return count;


    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String b : map.keySet()) {
            if (b.equals(lastName))
                count += 1;
        }
        return count;
    }


    public static void main(String[] args) {
        Map<String, String> map = createMap();
    }
}
