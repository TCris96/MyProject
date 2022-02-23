package com.sda.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {
    public static void main(String[] args) {
        readUsingBufferedReader();

    }
    public static void readUsingBufferedReader(){
        //try with resources
        //no need for finally
        try(FileReader fileReader =new FileReader("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources\\people.txt");
            BufferedReader bufferedReader =new BufferedReader(fileReader)
        ) {
            int i;
            while ((i = bufferedReader.read() )!= -1) {
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println("Error reading file");
        }
    }
    public static void readUsingBufferedReaderBasic(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("C:\\JavaProjects\\sda-course\\java-advanced\\src\\main\\resources");
            bufferedReader = new BufferedReader(fileReader);
            int i;
            while ((i = bufferedReader.read() )!= -1) {
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println("Error reading file");
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
