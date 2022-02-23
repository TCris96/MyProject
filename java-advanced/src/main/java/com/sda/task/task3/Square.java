package com.sda.task.task3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double size){
        super(color,isFilled,size,size);
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }
    @Override
    public String toString(){
        return String.format("Square with width = %f and length = %f which is a subclass of %s",width,
                length,super.toString());
    }
}
