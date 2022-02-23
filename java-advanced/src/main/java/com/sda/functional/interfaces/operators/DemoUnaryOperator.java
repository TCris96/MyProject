package com.sda.functional.interfaces.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> number*number;
        Integer result = unaryOperator.apply(10);
        System.out.println(result);
        List<Integer> list = Arrays.asList(10,20,30);
        List<Integer> newList = new ArrayList<>();
        list.forEach(number -> newList.add(unaryOperator.apply(number)));
        for(Integer number : newList){
            System.out.println(number);
        }
        useUnaryOperator(unaryOperator,list).forEach(number -> System.out.println(number));
    }
    private static List<Integer> useUnaryOperator(UnaryOperator<Integer> unaryOperator,List<Integer> list){
        List<Integer> uniList = new ArrayList<>();
        list.forEach(number -> uniList.add(unaryOperator.apply(number)));
        return uniList;
    }
}
