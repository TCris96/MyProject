package com.sda.device;

public abstract class Device {
     String brand;
     String color;
     int yearOfFabrication;
    int ram;

     Device() {

    }
     Device(String brand) {
        this.brand = brand;
    }

     Device(String brand, int yearOfFabrication) {
        this.brand = brand;
        this.yearOfFabrication = yearOfFabrication;
        this.color = "white";
        this.ram = 8;
    }

     Device(String brand, String color, int yearOfFabrication) {
        this.brand = brand;
        this.color = color;
        this.yearOfFabrication = yearOfFabrication;
    }


    public abstract void start();

    @Override
    public String toString() {
        if(ram ==0 && yearOfFabrication ==0){
            return "brand='" + brand + '\'' +
                    ", color='" + color + '\'';
        }
        return "Device{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", yearOfFabrication=" + yearOfFabrication +
                ", ram=" + ram +
                '}';
    }
}
