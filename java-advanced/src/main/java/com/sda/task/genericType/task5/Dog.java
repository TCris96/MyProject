package com.sda.task.genericType.task5;

public class Dog extends Animal implements Behavior {
    private String size;
    static int counter = 0;



    public Dog(String name, int age, String color, String size) {
        super(name, age, color);
        this.size = size;
        counter++;

    }


    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public String command(String command) {
        if (command != null) {
            if (command.equalsIgnoreCase("Sit")) {
                return "The dog is sitting.";
            } else if (command.equalsIgnoreCase("Bark")) {
                return "The dog is barking.";
            }
            return "Invalid command.";
        }
        return null;
    }
    public static int getCounter(){
        return counter;
    }

    @Override
    public String toString() {

        return "Dog " + " {" +
                "name=" + name +
                ", age=" + age +
                ", color=" + color +
                ", size=" + size +
                "} " + super.toString() + "\n";

    }
}
