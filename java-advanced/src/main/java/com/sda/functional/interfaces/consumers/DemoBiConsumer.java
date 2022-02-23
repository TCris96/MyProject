package com.sda.functional.interfaces.consumers;

import java.util.Map;
import java.util.function.BiConsumer;

public class DemoBiConsumer {
    public static void main(String[] args) {
       BiConsumer<String, Integer> biConsumer =(name, age) -> System.out.printf("%s is %d years old.\n",name,age);
        Map<String, Integer> students = Map.of("Ana",20,
                "Monika",22,
                "Luca",26);
        students.forEach(biConsumer);
        students.forEach((name,age) -> System.out.printf("In five years, %s will be %d years old.\n",name,age+5));
    }
}
