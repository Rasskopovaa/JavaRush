package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(5));//напишите тут ваш код
    }
    public static int convertToSeconds(int hour){
        int seconds= hour*3600;
        return seconds;

    }
}
