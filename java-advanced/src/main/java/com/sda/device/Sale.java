package com.sda.device;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sale {
    double initialPrice;
    double discount;
    double priceAfterDiscount;
    String dateOfSale;
    String product;

    Sale(){

    }
    Sale(String dateOfSale,String product, double discount){
        LocalDate date = parseString(dateOfSale);
        System.out.println(product+" will be discounted by "+discount+" % "
                +" on " +date);

    }

    Sale(double initialPrice , double priceAfterDiscount){
        this.initialPrice = initialPrice;
        this.priceAfterDiscount = priceAfterDiscount;
        discount = getDiscount();
        System.out.println("This product in on sale "+ discount+" %");
    }

    double getDiscount(){
        return (initialPrice - priceAfterDiscount)
                /initialPrice *100;
    }

    LocalDate parseString(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
    }
}
