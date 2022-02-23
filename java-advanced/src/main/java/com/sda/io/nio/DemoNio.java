package com.sda.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DemoNio {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one","two","three");
        Path path = Paths.get("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources\\output.txt");
        try {
            Files.write(path,list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
