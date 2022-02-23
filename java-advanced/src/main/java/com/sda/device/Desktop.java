package com.sda.device;

public class Desktop extends Device {
    private String processor;

    public Desktop(String brand, String processor){
        super(brand);
        this.processor = processor;
        this.color = "black";

    }


    @Override
    public void start() {

    }

    @Override
    public String toString() {
        return "Desktop{" +
                "processor='" + processor + '\'' +
                  super.toString() +"} ";
    }
}

