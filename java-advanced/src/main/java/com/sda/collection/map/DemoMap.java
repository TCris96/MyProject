package com.sda.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<>();
        countries.put("RO","Romania");
        countries.put("HU","Hungary");
        countries.put("RU","Russia");
        //returns Collection type because values can be duplicated
        Collection<String> values = countries.values();
        //returns Set type because keys can't be duplicated
        Set<String> keys = countries.keySet();
        System.out.println(values);
        System.out.println(keys);

        //Entry=value + key
        for(Map.Entry<String,String> entry : countries.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%s - %s|",key,value);

        }
        System.out.println();
        System.out.println(countries.get("RO"));
        countries.remove("RU");
        countries.size();
        System.out.println(values); //size:2
        System.out.println(keys);
    }
}
