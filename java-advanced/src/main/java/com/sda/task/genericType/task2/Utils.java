package com.sda.task.genericType.task2;

public class Utils {
    public static <T> int countIf(T[] tab, Validator<T> validator){
        int count = 0;
        for(T element : tab){
            if(validator.validate(element)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] tab ={10,21,33,40,50,60};
        int result = Utils.countIf(tab, new Validator<Integer>() {
            @Override
            public boolean validate(Integer value) {
                return value % 3 == 0;
            }
        });
        System.out.println(result);
    }
}
