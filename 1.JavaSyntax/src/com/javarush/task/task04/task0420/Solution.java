package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max, mid, min;
        if (a >= b && a >= c) {
            max = a;
            if (b < c) {
                mid = c;
                min = b;
            } else {
                mid = b;
                min = c;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a < c) {
                mid = c;
                min = a;
            } else {
                min = c;
                mid = a;
            }
        } else {
            max = c;
            if (a < b) {
                mid = b;
                min = a;
            } else {
                min = b;
                mid = a;
            }
        }
        System.out.println(max + " " + mid + " " + min);
    }

}
