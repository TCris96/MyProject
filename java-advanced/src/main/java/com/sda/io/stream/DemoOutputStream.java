package com.sda.io.stream;

import java.io.*;

public class DemoOutputStream {
    public static void main(String[] args) {
        Person person = new Person();
        person.setLastName("Vasile");
        person.setName("Ion");

        File file = new File("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources\\person.txt");
        try(OutputStream outputStream = new FileOutputStream(file)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(person);
        }catch (IOException e){
            System.out.println("Error writing to file");
        }
    }
}
