package com.sda.task.task3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super.setColor("unknown");
        super.setFilled(false);
        this.width = 1;
        this.length = 1;

    }

    @Override
    double getArea() {
        return width * length ;
    }

    @Override
    double getPerimeter() {
        return 2*(width+ length);
    }

    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color,isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public String toString() {
        return "Rectangle with width = " +
                 width +
                ", length=" + length +
                " which is a subclass off  " + super.toString();
    }
}
