package com.sda.task.genericType.task5;

public class Cat extends Animal implements Behavior{
   private String colorOfEyes;

   public Cat(){

   }
   public Cat(String name, int age, String color, String colorOfEyes){
       super(name,age,color);
       this.colorOfEyes = colorOfEyes;
   }
    @Override
    public void run() {
        System.out.println("The cat is running");
    }

    @Override
    public String command(String command) {
        if(command != null){
            return "You can't train a cat. Buy a dog!";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                "} " + super.toString();
    }
}
