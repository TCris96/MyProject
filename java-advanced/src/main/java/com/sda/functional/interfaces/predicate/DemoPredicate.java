package com.sda.functional.interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = (name) -> name.isEmpty();
        boolean result = predicate.test("house");
        System.out.println(result);

        List<String> nameslist = Arrays.asList("mara","alina");
        List<String> booleanList = nameslist.stream()
                .filter(name -> name.contains("r"))
                .collect(Collectors.toList());
        System.out.println(booleanList);
    }
}
