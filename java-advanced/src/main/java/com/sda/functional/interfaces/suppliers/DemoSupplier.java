package com.sda.functional.interfaces.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        Supplier<Integer> supplier=() -> 9;
        Integer result = supplier.get();
        System.out.println(result);

        Supplier<Integer> randomNumbers = () -> new Random().nextInt(100);
        Integer result2 = randomNumbers.get();
        System.out.println(result2);

        Supplier<Exception> result3 = () -> new RuntimeException("does not exist");
    }
}
