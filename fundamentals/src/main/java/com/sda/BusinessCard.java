package com.sda;

public class BusinessCard {
    public static void main(String[] args) {
        String sign = "---------------------";
        char line = '|';
        char corner = '/';
        char corner2 = '\\';
        String name = "Cristina";
        String surname = "Tufan";
        String street = "Grigore Gabrielescu";
        int buldingNumber = 5;
        int flatNumber = 10;
        int zipCode = 22356;

        String phoneNumber = "0761127667";
        String country = "Romania";
        String city = "Craiova";


        System.out.println(corner + sign + corner2);
        System.out.println(line + "    " + name + " " + surname + "   " + line);
        System.out.println(line + " " + street + " " + line);
        System.out.println(line + "         " + buldingNumber + "/" + flatNumber + "        " + line);
        System.out.println(line + city + "," + country + "/" + zipCode + line);
        System.out.println(line + "     " + phoneNumber + "      " + line);
        System.out.println(corner2 + sign + corner);
    }
}
