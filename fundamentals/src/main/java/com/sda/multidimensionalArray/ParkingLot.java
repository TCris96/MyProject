package com.sda.array;

import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        char[][] parking = createParking(5, 10);
        Scanner input = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1.View parking lots");
            System.out.println("2.Park the car");
            System.out.println("0.Exit");
            optiune = input.nextInt();
            if (optiune == 1) {
                display(parking);
            } else if(optiune==2){
                System.out.println("Enter the parking row:");
                int row=input.nextInt();
                System.out.println("Enter the parking column:");
                int column=input.nextInt();
                boolean isParked= parkTheCar(parking,row,column);
                if(!isParked){
                    System.out.println("The parking lot is taken!");
                }

            }
        } while (optiune != 0);
    }

    private static boolean parkTheCar(char[][] parking, int row, int column) {
        if(parking[row][column]=='O'){
            parking[row][column]='X';
            return true;
        } else {
            return false;
        }
    }

    private static void display(char[][] parking) {
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                System.out.print(parking[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] createParking(int row, int column) {
        char[][] parkingLots = new char[row][column];
        for (int i = 0; i < parkingLots.length; i++) {
            for (int j = 0; j < parkingLots[i].length; j++) {
                parkingLots[i][j] = 'O';

            }
        }
        return parkingLots;
    }

}
