package com.sda.task.genericType.task5;

public class PetHouse <T extends Animal>{
    private T[] elements;

    public PetHouse(T[] array){
        this.elements = array;
    }
    public T[] getElements(){
        return elements;
    }
    public int displayIndex(){
        for(int i =0;i< elements.length;i++){
            return i+1;
        }
        return 0;
    }
}
