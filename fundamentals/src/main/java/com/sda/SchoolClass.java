package com.sda;

import java.util.Scanner;

public class SchoolClass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        int i = 0;
        int theBiggestScore = 0;
        String theName = "";
        int secondGrade=0;
        String secondStudent="";
        while (i < numberOfStudents) {
            System.out.println("Student's name: ");
            String name = reader.nextLine();
            System.out.println("Student's grade:");
            int score = input.nextInt();
            input.nextLine();
            if (score > theBiggestScore) {
                secondGrade = theBiggestScore;
                secondStudent = theName;
                theBiggestScore=score;
                theName=name;
            } else if(score>secondGrade){
                secondGrade=score;
                secondStudent=name;
            }

            i++;
        }
        System.out.println(theName + " is the student with the biggest grade");
        System.out.println(secondStudent+" is the second student ");
    }
}
