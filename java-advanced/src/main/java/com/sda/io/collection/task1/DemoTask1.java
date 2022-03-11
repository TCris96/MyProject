package com.sda.io.collection.task1;

public class DemoTask1 {
    public static void main(String[] args) {
        SDAArrayList<String> students = new SDAArrayList<String>();
        students.add( "Maria");
        students.add( "Anca");
        students.add( "Bianca");
        students.add( "Bogdan");
        students.add( "Ionut");
        students.display();
        students.remove(2);
        students.display();
        System.out.println( students.get(2));

    }
}
