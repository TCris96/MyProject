package com.sda.device;

public class Phone extends MobileDevice{
     int battery;
     boolean isOnSale;
    Sale onSale;
    Apps app;


    public Phone(){

    }
    public Phone(String brand, boolean isOnSale, double initialPrice, double priceAfter){
        super(brand);
        this.isOnSale = isOnSale;
        if(isOnSale == true){
            onSale = new Sale(initialPrice,priceAfter);
        }

    }


    @Override
    public void isFunctional() {
        super.isFunctional();
        System.out.println("Your device is ready");
    }
}
