package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<Integer, String> months = new HashMap<>();

        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        for (HashMap.Entry<Integer, String> pair : months.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (month.equals(value)) {
                System.out.println(value + " is the " + key + " month");
            }
        }
    }
}
