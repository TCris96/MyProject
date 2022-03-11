package com.sda;

import java.text.DecimalFormat;
import java.util.List;

public class Exemple {
    public static void main(String[] args) {
        plusMinus(List.of(-4,3,-9,0,4,1));
    }
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int pozCounter = 0;
        int negCounter = 0;
        int zeroCounter = 0;
        for(int number : arr){
            if(number > 0 ){
                pozCounter++;
            } else if(number <0 ){
                negCounter++;
            } else{
                zeroCounter++;
            }
        }
        DecimalFormat f = new DecimalFormat("#.######");
        double result =(double) pozCounter/n;
        System.out.println(f.format(result));
        result = (double) negCounter/n;
        System.out.println(f.format(result));
        result =(double) zeroCounter/n;
        System.out.println(f.format(result));

    }

}


