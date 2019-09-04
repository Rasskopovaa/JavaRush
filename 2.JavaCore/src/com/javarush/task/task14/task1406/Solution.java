package com.javarush.task.task14.task1406;

/* 
Без ошибок
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry(); //Add your code here

        Mouse mouse = (Mouse) obj; //(Не каждый обект это мышь)
        GreyMouse greyMouse = (GreyMouse) mouse;// (Не каждая мышь это сера мышь)
        Jerry jerry = (Jerry) greyMouse; //(Не каждая серая мышь это Джери)
        printClasses(obj, mouse, greyMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GreyMouse greyMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GreyMouse extends Mouse {
    }

    static class Jerry extends GreyMouse {
    }

}