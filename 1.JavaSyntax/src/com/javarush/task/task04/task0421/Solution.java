package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();

        int lengthFirstName = firstName.length();
        int lengthSecondName = secondName.length();
        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (lengthSecondName == lengthFirstName) {
            System.out.println("Длины имен равны");
        } else {
        }
    }
}
