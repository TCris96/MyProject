package com.sda.functional.lambda.oneparam;

public class DemoOneParam {
    public static void main(String[] args) {
       OneParam oneParam = (number) -> number * 5;
       int result = oneParam.mathOperation(5);
        System.out.println(result);
    }
}
