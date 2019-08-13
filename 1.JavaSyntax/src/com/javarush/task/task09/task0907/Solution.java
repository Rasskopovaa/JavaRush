package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Before method1 calling");
            int a = 42 / 0;
            System.out.println("After method1 calling. Never will be shown");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has been caught");
        }

        System.out.println("Program is still running");
    }

    //напишите тут ваш код
}
