package com.sda.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Car audi = new Car(2016);
        Car dacia = new Car(2014);
        Car bmw = new Car(2020);
        carList.add(audi);
        carList.add(dacia);
        carList.add(bmw);
        for (Car car : carList){
            System.out.print(car +" ");
        }
        System.out.println();
        Collections.sort(carList);
        for (Car car : carList){
            System.out.print(car +" ");
        }

    }


}
