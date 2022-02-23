package com.sda.task.task1;

public class Point2D {
    float x,y;


    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    float[] getXY(float x, float y) {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
