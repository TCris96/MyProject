package com.sda.functional.interfaces.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class DemoBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (key, value) -> key +"-"+ value;
        Map<String,String> map = new HashMap<>();
        map.put("mother","father");
        map.put("sister","brother");

    //using the current map
        map.forEach((key, value) -> System.out.println(binaryOperator.apply(key,value)));

    //store the results in a list
        List<String> list = new ArrayList<>();
        map.forEach((key, value) ->{
            String result = binaryOperator.apply(key, value);
            list.add(result);
        });
        System.out.println(list.toString());

    }
}
