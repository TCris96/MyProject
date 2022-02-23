package com.sda.device;

public class Tablet extends Device {
   private String operatingSystem;
    private int display;

    public Tablet(String brand,int display){
        super(brand);
        this.color = "black";
        this.yearOfFabrication=2020;
        this.operatingSystem ="Android";
        this.display = display;

    }

    @Override
    public void start() {
        System.out.println("Loading..");
    }

    public Tablet(String brand, String color, int yearOfFabrication,String operatingSystem, int display) {
        super(brand, color, yearOfFabrication);
        this.operatingSystem = operatingSystem;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "brand=" + this.brand +
                ", color:" +this.color +
                ", year of fabrication: "+this.yearOfFabrication+
                ", operating System='" + operatingSystem + '\'' +
                ", display=" + display +
                '}';
    }
}
