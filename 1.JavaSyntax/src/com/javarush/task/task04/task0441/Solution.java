package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int mid = 0;
        if (a < b && a >= c || a <= c && a > b) {
            mid = a;
        }
        if (b < a && b >= c || b >= a && b < c) {
            mid = b;
        }
        if (c <= a && c > b || c > a && c <= b) {
            mid = c;
        } else if (a == b && b == c) {
            mid = c;
        }
        System.out.println(mid);
    }
}
