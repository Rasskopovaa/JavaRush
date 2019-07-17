package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (Math.max(a, b) == c && Math.max(a, b) == d && c == d)
            System.out.println(c);
        else if (Math.max(a, b) >= c && Math.max(a, b) > d)
            System.out.println(Math.max(a, b));
        else if (c > Math.max(a, b) && c >= d)
            System.out.println(c);
        else
            System.out.println(d);

    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }


}
