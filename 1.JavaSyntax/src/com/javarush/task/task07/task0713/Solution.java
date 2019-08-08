package com.javarush.task.task07.task0713;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listbad = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer s : list) {
            if (s % 3 == 0)
                list3.add(s);
            if (s % 2 == 0)
                list2.add(s);
            if (s % 2 > 0 && s % 3 > 0)
                listbad.add(s);

        }
        printList(list3);
        printList(list2);
        printList(listbad);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer s : list) {
            System.out.println(s);
        }
    }
}
