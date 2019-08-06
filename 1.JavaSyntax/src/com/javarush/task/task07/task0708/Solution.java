package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(reader.readLine());
        }
        int MaxLenght = list.get(0).length();
        for (String s : list) {
            if (s.length() > MaxLenght)
                MaxLenght = s.length();
        }

        for (String s : list) {
            if (s.length() == MaxLenght)
                System.out.println(s);
        }
    }
}