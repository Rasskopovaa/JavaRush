package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i > 0; i++) {
            int a = scanner.nextInt();
            sum += a;
            if (a == -1)
                break;
        }
        System.out.println(sum);
    }
}
