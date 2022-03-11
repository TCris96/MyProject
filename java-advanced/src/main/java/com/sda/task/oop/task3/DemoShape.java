package com.sda.task.oop.task3;

public class DemoShape {
    public static void main(String[] args) {

        Circle circle = new Circle("blue",true,5);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("black", true, 10,10);
        System.out.println(rectangle);
        Square square = new Square("green", false,10);
        System.out.println(square);
    }
}
