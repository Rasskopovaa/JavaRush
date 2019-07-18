package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int number1 = 1, number2 = 2, number3 = 3;
        if (a == b)
            System.out.println(number3);
        else if (a == c)
            System.out.println(number2);
        else if (b == c)
            System.out.println(number1);
    }
}
