package com.sda.task.enums.task1;

public class DemoEnums {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: "+ Weekday.SATURDAY.isHoliday());
        System.out.println("Saturday is : ");
        Weekday.SATURDAY.whichIsGreater(Weekday.SUNDAY);
    }
}
