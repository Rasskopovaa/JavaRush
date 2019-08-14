package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] array = reader.readLine().toCharArray();

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                list1.add(array[i]);

            } else if (array[i] == ' ') {// проверяем есть ли пробел, и пропускаем его
                continue;
            } else {
                list2.add(array[i]);
            }
        }

        for (char c : list1) {
            System.out.print(c + " ");
        }
        System.out.println();// переводим курсов на другую строчку
        for (char c : list2) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}