package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty())
                break;
            else {
                String lastName = reader.readLine();
                map.put(city, lastName);
            }
        }

        String town = reader.readLine();
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(town))
                System.out.println(pair.getValue());
        }
    }
}