package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] c = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            String a = new String(c, i, c.length - i);//массив символов,номер первого элемента,номер последнего
            System.out.println(a);
        }
    }

}

