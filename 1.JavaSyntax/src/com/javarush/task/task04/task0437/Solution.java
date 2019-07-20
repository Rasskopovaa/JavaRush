package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j < 20 - i) {
                    System.out.print("");
                } else {
                    System.out.print("8");
                }
            }


        }
    }
}