package com.sda.task.enums.task2;

public class DemoTask2 {
    public static void main(String[] args) {
        PackageSize packageSize = PackageSize.getPackageSize(40, 60);
        System.out.println(packageSize);

    }
}
