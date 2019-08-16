package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();
        list[0].add("фффф");
        list[0].add("ффф");
        list[0].add("фффa");
        list[1] = new ArrayList<>();
        list[1].add("вввв");
        list[1].add("вввв");
        list[1].add("вввв");
        list[2] = new ArrayList<>();
        list[2].add("аааа");
        list[2].add("аааа");
        list[2].add("ааааa");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}