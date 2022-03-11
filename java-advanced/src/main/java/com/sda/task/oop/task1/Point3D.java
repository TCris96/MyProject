package com.sda.task.oop.task1;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    float[] getXYZ(float x, float y, float z) {
        float[] array = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}
