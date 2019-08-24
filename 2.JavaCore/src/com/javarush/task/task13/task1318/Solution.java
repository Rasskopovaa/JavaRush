package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        InputStream is = new FileInputStream(rd.readLine());
        while (is.available() > 0) {
            System.out.print((char) is.read());// напишите тут ваш код
        }
        System.out.println();
        is.close();
        rd.close();
    }
}