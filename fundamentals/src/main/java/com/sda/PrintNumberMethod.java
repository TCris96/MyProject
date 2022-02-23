package com.sda;

import java.util.Scanner;

public class PrintNumberMethod {
    public static void main(String[] args) {
        printNumber(7);
    }
    public static void printNumber(int number){
        for(int i=0;i<10;i++){
            System.out.print("- ");
        }
        System.out.println();
        for(int i=1;i<=10;i++){
            if(i==number){
                System.out.print(number);
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print("- ");
        }
        System.out.println();
    }
}
