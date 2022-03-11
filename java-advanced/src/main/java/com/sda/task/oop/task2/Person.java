package com.sda.task.oop.task2;

public abstract class Person {
    String name, address;

    Person(){

    }
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s->%s",name,address);

    }
}
