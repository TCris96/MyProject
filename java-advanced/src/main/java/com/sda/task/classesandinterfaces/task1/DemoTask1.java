package com.sda.task.classesandinterfaces.task1;

public class DemoTask1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] emails = userValidator.userValidator("cristina.t@yahoo.com", "");
        System.out.println(emails[0]);
        System.out.println(emails[1]);
    }
}
