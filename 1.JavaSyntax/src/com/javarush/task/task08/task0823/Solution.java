package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] array = s.toCharArray();


        for (int i = 0; i < array.length; i++) {

            char n = Character.toUpperCase(array[0]);
            array[0] = n;

            if (Character.isSpaceChar(array[i])) {

                array[i + 1] = Character.toUpperCase(array[i + 1]);


            }
        }
        String a = new String(array);
        System.out.println(a);
    }
}
//2 часа, не без помощи гугла.