package com.sda.task.classesandinterfaces.task4;

import java.util.Locale;

public class DemoTask4 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Maria", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && input != null && input.startsWith(input.substring(0, 1).toUpperCase(Locale.ROOT));
            }
        });
        user.setLastName("Ungureanu", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && input != null && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge(20, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input>0&&input<150;
            }
        });
        user.setLogin("pinguin0", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("acdf", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
        System.out.println(user);
    }
}
