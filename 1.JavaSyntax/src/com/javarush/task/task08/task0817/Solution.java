package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Аленова", "Алена");
        map.put("Игорев", "Игорь");
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<String>(map.values());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i).equals(list.get(j))) {
                    removeItemFromMapByValue(map, (String) list.get(i));
                }
            }


        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
