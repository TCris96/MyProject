package com.sda.io.collection.task3;

import java.util.*;

public class DemoTask3 {
    public static void main(String[] args) {
        List<Integer> arrayOfNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayOfNumbers.add(random.nextInt(5));
        }
        for (Integer number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        Set<Integer> setOfNumbers = new HashSet<>();
        Set<Integer> duplicatedNumbers = new HashSet<>();
        for (Integer number : arrayOfNumbers) {
            if(!setOfNumbers.add(number)){
                duplicatedNumbers.add(number);
            }
        }
//        for (Integer number : setOfNumbers) {
//            System.out.print(number + " ");
//        }
        System.out.println(setOfNumbers);
        System.out.println(duplicatedNumbers);


    }

}
