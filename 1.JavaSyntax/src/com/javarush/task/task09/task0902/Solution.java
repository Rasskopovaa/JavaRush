package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        return name;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        return name;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        return name;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        return name;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        return name;
    }
}
