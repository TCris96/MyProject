package com.sda.functional.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class DemoBiFunction {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("John",40000);
        employees.put("Anna",70000);
        employees.put("Angela",50000);

        //create function for increasing all salaries except John's
        BiFunction<String, Integer, Integer> biFunction =
                (name,salary) -> {
            if(!name.equalsIgnoreCase("John")){
                salary += 10000;
            }
            return salary;
                };
        BiFunction<String,Integer,Integer> biFunction1 =
                (name, salary) -> name.equalsIgnoreCase("John") ? salary : salary+10000;

        //apply function to map
        employees.replaceAll(biFunction1);
        // print map
        employees.forEach((name,salary) -> System.out.println(name+": "+salary));
    }
}
