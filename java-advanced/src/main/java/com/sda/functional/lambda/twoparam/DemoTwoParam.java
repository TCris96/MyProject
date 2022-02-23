package com.sda.functional.lambda.twoparam;

import java.util.Locale;

public class DemoTwoParam {
    public static void main(String[] args) {
      TwoParam twoParam =   (text,text1) -> {
            return text.concat(text1).toUpperCase(Locale.ROOT);
        };
        String result = twoParam.concatenation("robert", "jr");
        System.out.println(result);
    }
}
