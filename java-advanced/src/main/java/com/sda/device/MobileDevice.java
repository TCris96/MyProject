package com.sda.device;

public class MobileDevice extends Device {
     int display;
     boolean fiveG;

    public MobileDevice(){

    }

    public MobileDevice(String brand, String color, int yearOfFabrication, int display, boolean fiveG){
        super(brand, color, yearOfFabrication);
        this.display = display;
        this.fiveG = fiveG;
    }

    public MobileDevice(String brand) {
        super(brand);
        this.fiveG = false;
        this.display = 90;
    }

    @Override
    public void start() {

    }


    public void isFunctional(){
        System.out.println("The device is downloading the configurations");
    }
}
