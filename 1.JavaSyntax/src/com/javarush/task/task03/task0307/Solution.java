package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1= new Zerg();
        zerg1.name="L";
        Zerg zerg2= new Zerg();
        zerg2.name="M";
        Zerg zerg3= new Zerg();
        zerg3.name="N";
        Zerg zerg4= new Zerg();
        zerg4.name="w";
        Zerg zerg5=new Zerg();
        zerg5.name="A";

        Protoss protoss1= new Protoss();
        protoss1.name="U";
        Protoss protoss2= new Protoss();
        protoss2.name="C";
        Protoss protoss3= new Protoss();
        protoss3.name="Y";

        Terran terran1 = new Terran();
        terran1.name="b";
        Terran terran2 = new Terran();
        terran2.name="q";
        Terran terran3 = new Terran();
        terran3.name="C";
        Terran terran4 = new Terran();
        terran4.name="g";
        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
