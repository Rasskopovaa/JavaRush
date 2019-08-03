package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int c = a;
        while (c > 0) {
            int b = c % 2;
            c = c / 10;
            if (b == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even:" + " " + even + " " + "Odd:" + " " + odd);
    }
}
