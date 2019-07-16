package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if (a > 0) {
            int y = a * 2;
            System.out.println(y);
        } else if (a == 0) {
            System.out.println(0);
        } else {
            int y = a + 1;
            System.out.println(y);
        }
    }

}