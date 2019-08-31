package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));//поток читающий из файла
        ArrayList<Integer> numbers = new ArrayList<>();
        while (reader.ready()) {
            int f = Integer.parseInt(reader.readLine());
            if (f % 2 == 0)
                numbers.add(f);
        }
        reader.close();
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
