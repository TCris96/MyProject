package com.sda.task.oop.task6;

public class DemoTask6 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(10,10,3,3);
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        Movable movableCircle = new MovableCircle(10,20,30,4,4);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
