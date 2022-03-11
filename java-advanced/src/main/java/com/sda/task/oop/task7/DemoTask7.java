package com.sda.task.oop.task7;

public class DemoTask7 {
    public static void main(String[] args) {
        Circle circle = new Circle(14);
        System.out.println(circle.getArea());
        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);
    }
}
