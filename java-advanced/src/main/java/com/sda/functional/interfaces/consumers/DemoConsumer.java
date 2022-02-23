package com.sda.functional.interfaces.consumers;


import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);
        List<String> nameList = List.of("Ana",
                "Maria",
                "Monika");
        nameList.forEach(consumer);
        nameList.forEach(name -> System.out.println("My name is "+name));
    }
}
