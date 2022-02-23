package com.sda.io.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoBufferedWriter {
    public static void main(String[] args) {
writeUsingBufferedWriter();
    }

    public static void writeUsingBufferedWriter() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Anca");
        nameList.add("Nina");
        nameList.add("Andrei");
        File file = new File("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources\\nameList.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for(String name : nameList){
                bufferedWriter.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }
}
