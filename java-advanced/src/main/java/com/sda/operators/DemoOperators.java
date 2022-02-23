package com.sda.operators;

import java.util.*;
import java.util.function.UnaryOperator;

public class DemoOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> number * number;
        List<Integer> integers = Arrays.asList(10,20,30,40,50);
        List<Integer> result = new ArrayList<>();
        integers.forEach(number -> {
            // apply transformation
            Integer transformedNumber = unaryOperator.apply(number);
            //add to result
            result.add(transformedNumber);
        } );
        System.out.println(result);

    }
}
