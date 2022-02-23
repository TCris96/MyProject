package com.sda.device;

public class Laptop extends Device {


    public Laptop(String brand, String color, int yearOfFabrication, int ram){
        super(brand, color, yearOfFabrication);
        this.ram = ram;

    }
    public Laptop(String brand, int yearOfFabrication){
        super(brand,yearOfFabrication);
    }


    public void start(){
        System.out.println("Starting..");
        System.out.println("Welcome!");

    }

}
