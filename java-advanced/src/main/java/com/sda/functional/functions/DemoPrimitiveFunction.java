package com.sda.functional.functions;

import java.util.function.IntToDoubleFunction;

public class DemoPrimitiveFunction {
    public static void main(String[] args) {
        //int array
        //transform to double(2 times)
        int[] array = {1,2,3,};
        //int to double
        transformArray(array,value -> value*2);

    }
    private static double[] transformArray(int[] array, IntToDoubleFunction function){
        double[] transformedArray = new double[array.length];
        for(int i =0;i< array.length;i++){
            transformedArray[i]=function.applyAsDouble(array[i]);
        }
        return transformedArray;
    }
}
