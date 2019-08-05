package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[10];
        int[] numbers = new int[10];
        for (int i = 0; i < words.length; i++) {
            String s = buffer.readLine();
            words[i] = s;
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = words[i].length();
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }

}
