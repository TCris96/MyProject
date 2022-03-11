package com.sda.io.collection.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class SDAArrayList<T> {
    private static final int INITIAL_CAPACITY = 5;
    private Object[] elementArray;
    private int size = 0;

    public SDAArrayList() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide a valid index");
        }
        return (T) elementArray[index];
    }

    public void add(T t) {
        if (size == elementArray.length) {
            increaseArraySize();
        }
        elementArray[size++] = t;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide a valid index");
        }
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i+1];
        }
        size--;
        decreaseArraySize();
    }
    public void display(){
        for(Object element:elementArray){
            System.out.println(element);
        }
    }

    private void increaseArraySize() {
        int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newIncreasedCapacity);
    }

    private void decreaseArraySize() {
        elementArray = Arrays.copyOf(elementArray, elementArray.length - 1);
    }

}
