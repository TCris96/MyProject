package com.sda.collection.comparable;

public class Car implements Comparable<Car> {
   private int fabricationYear;
    public Car(int fabricationYear){
        this.fabricationYear = fabricationYear;
    }

    @Override
    public int compareTo(Car otherCar ) {
        return this.fabricationYear - otherCar.fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabricationYear=" + fabricationYear +
                '}';
    }
}
