package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String s = (buffer.readLine());
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buffer.readLine());
        return a;

    }

    public static double readDouble() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(buffer.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(buffer.readLine());
        return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    }
}
