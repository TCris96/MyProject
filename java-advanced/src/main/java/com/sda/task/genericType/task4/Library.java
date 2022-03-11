package com.sda.task.genericType.task4;

import java.util.ArrayList;

public class Library<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    @Override
    public String toString() {
        return "Library{" +
                 list +
                '}';
    }
}
