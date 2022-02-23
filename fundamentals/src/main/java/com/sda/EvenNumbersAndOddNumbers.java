package com.sda;

import java.util.Scanner;

public class EvenNumbersAndOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers except for 0: ");
        int option= input.nextInt();
        int evenCounter=0;
        int oddCounter=0;
        while(option !=0){
            if(option%2==0){
                evenCounter++;
            } else{
                oddCounter++;
            }
            option=input.nextInt();
        }
        System.out.println("You have entered "+ evenCounter+" even numbers");
        System.out.println("You have entered "+oddCounter+" odd numbers");


    }
}
