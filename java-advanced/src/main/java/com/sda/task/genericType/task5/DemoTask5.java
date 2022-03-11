package com.sda.task.genericType.task5;

import java.util.Arrays;

public class DemoTask5 {
    public static void main(String[] args) {
        Animal[] animal = {new Dog("Luci",1,"brown","small"),
                new Dog("Daisy",12,"black","medium"),
                new Cat("Shiva",2,"Brown with white", "green")};
        PetHouse<Animal> houseOfAnimals = new PetHouse<>(animal);
        System.out.println(Arrays.toString(houseOfAnimals.getElements()));
        System.out.println("Total of dogs: "+Dog.getCounter());
        Cat cat = new Cat();
        System.out.println(cat.command("Sit"));
    }
}
