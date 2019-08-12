package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Аленова", 1111);
        map.put("Игорев", 2222);
        map.put("Jkjk", 333);
        map.put("Иfffв", 444);
        map.put("Аggfова", 4555);
        map.put("Игdgfев", 6666);
        map.put("Алdfва", 5633);
        map.put("Игоsddsв", 3333);
        map.put("Аsdва", 35635);
        map.put("Игfdев", 3535);

        return map;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        // ArrayList<Integer> list= new ArrayList<>(map.values());

        Iterator<Map.Entry<String, Integer>> pair = map.entrySet().iterator();
        while (pair.hasNext()) {
            Map.Entry<String, Integer> entry = pair.next();
            if (entry.getValue() < 500) {
                pair.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}