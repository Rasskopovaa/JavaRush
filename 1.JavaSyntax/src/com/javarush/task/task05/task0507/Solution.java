package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double summ = 0;
        double result = 0;
        double avSumm = 0;
        for (int i = 0; i > 0; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            if (a == -1) {
                break;
            }
            summ += a;
            result++;
        }
        avSumm = summ / result;
        System.out.println(avSumm); //разобрать


    }

}
