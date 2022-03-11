package com.sda.task.genericType.task3;

import java.util.Arrays;

public class DemoTask3 {
    public static <T> void swapElements(T[] array, int index1, int index2){
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;

        }

    public static void main(String[] args) {
        Integer[] tab = {10,21,33,40,50,60};
        swapElements(tab,2,3);
        System.out.println(Arrays.toString(tab));
    }
    }

