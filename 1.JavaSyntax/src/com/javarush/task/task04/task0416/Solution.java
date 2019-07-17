package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t % 5.0;
        if (t < 3) System.out.println("зелёный");
        if (3 <= t && t < 4) System.out.println("жёлтый");
        if (4 <= t && t < 5) System.out.println("красный");


    }
}