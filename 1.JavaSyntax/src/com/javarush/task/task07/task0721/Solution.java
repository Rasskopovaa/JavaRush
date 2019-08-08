package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i : numbers) {
            if (i > maximum)
                maximum = i;
        }
        for (int i : numbers) {
            if (i < minimum)
                minimum = i;
        }

        System.out.print(maximum + " " + minimum);
    }
}
