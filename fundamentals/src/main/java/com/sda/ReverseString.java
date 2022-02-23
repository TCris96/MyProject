
package com.company;

public class ReverseString {

    public static void main(String[] args) {

        String name="name";
        System.out.println(name.toUpperCase());


    }

    public static void reverse(String name) {
        char[] reverseName = name.toCharArray();
        for (int i = reverseName.length - 1; i >= 0; i--) {
            System.out.print(reverseName[i]);
        }

    }
}
