package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int[] arraysize = new int[10];
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            arraysize[i] = list.get(i).length();
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (arraysize[i] > arraysize[i + 1]) {
                System.out.println(i + 1);
                break;
            } else {

            }
        }
    }
}