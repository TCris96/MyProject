package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoWordCount {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources\\wordCount.txt");
        try {
            countWordOccurrences(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Map<String,Integer> countWordOccurrences(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        Map<String, Integer> occurrencesMap = new HashMap<>();

        for(String line :lines){
            String[] words =line.split(" ");
            for(String word:words){
                if(occurrencesMap.containsKey(word)){
                    int count = occurrencesMap.get(word);
                    occurrencesMap.put(word, count+1);
                } else {
                    occurrencesMap.put(word, 1);
                }
            }
        }
        return occurrencesMap;

    }
}
