package com.sda.task.classesandinterfaces.task3;

public class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type){
        this.name = name;
        this.type = type;
        this.engine = new Engine();
        engine.setEngine(type);
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return  this.type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private String engineType;

        public void setEngine(String carType){
        if(carType.equalsIgnoreCase("economy")){
            this.engineType = "diesel";
        } else if(carType.equalsIgnoreCase("luxury")){
            this.engineType = "electric";
        } else {
            this.engineType = "petrol";
        }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "type='" + engineType + '\'' +
                    '}';
        }
    }
}
