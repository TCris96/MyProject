package com.sda.task.enums.task3;

public class DemoTask3 {
    public static void main(String[] args) {
        System.out.println(TemperatureConvert.C_F);
        float temperature = TemperatureConvert.convertTemperature('C', 'F', 10);
        System.out.println(temperature);
    }
}
