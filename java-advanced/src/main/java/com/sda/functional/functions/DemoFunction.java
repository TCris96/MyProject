package com.sda.functional.functions;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        //create a function to multiply numbers
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number*2;
            }
        };
        //sort way
        Function<Integer, Integer> function1 = (number) -> number*2;
        Integer result = function1.apply(5);
    }

}
