package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/


public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Bob", true, 71);
        Human grandfather2 = new Human("Jack", true, 55);
        Human grandmother1 = new Human("Alina", false, 60);
        Human grandmother2 = new Human("Ira", false, 50);

        Human mother = new Human("Jenya", false, 26, grandfather1, grandmother1);
        Human father = new Human("Oleg", true, 29, grandfather2, grandmother2);

        Human child1 = new Human("Olya", false, 5, mother, father);
        Human child2 = new Human("Igor", true, 1, mother, father);
        Human child3 = new Human("Lessya", false, 4, mother, father);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}