package com.sda.task.oop.task7;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(int radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent/100;
    }
}
