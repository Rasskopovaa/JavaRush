package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method3();
    }

    public static StackTraceElement[] method3() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method4();
    }

    public static StackTraceElement[] method4() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method5();
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method6();
    }

    public static StackTraceElement[] method6() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method7();
    }

    public static StackTraceElement[] method7() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method8();
    }

    public static StackTraceElement[] method8() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
