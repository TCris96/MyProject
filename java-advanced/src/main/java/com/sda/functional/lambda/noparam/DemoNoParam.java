package com.sda.functional.lambda.noparam;

public class DemoNoParam {
    public static void main(String[] args) {
        NoParam noParam = () -> "Hello";
        String result = noParam.doSomething();
        System.out.println(result);



    }


}
