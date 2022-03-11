package com.sda.task.exceptions.task1;

public class DemoTask1 {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);

    }
    public static int divide(int number1, int number2) throws CanNotDivideBy0Exception{
        if(number2 == 0){
            throw new CanNotDivideBy0Exception();
        }
        return number1 / number2;
    }
}
