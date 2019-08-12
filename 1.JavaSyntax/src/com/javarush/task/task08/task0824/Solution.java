package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human("Ребенок1", true, 10, new ArrayList());
        Human child2 = new Human("Ребенок2", false, 16, new ArrayList());
        Human child3 = new Human("Ребенок3", false, 1, new ArrayList());
        ArrayList<Human> chlds = new ArrayList<>();
        chlds.add(child1);
        chlds.add(child2);
        chlds.add(child3);


        Human father = new Human("Олег", true, 35, chlds);
        Human mather = new Human("Ирина", false, 30, chlds);

        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);


        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(mather);


        Human grandpa = new Human("Олег", false, 44, parents1);
        Human grandma = new Human("jОльга", true, 66, parents1);
        Human grandma2 = new Human("JJjj", true, 55, parents2);
        Human grandpa2 = new Human("Kkkk", false, 77, parents2);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(grandma.toString());
        System.out.println(grandma2.toString());
        System.out.println(grandpa.toString());
        System.out.println(grandpa2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
