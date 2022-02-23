package com.sda.collection.stack;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(5);
        integers.push(7);
        integers.push(9);
        integers.size();
        System.out.println(integers);
        System.out.println(integers.peek());


        integers.pop();
        integers.size();
        System.out.println(integers);
        System.out.println(integers.search(5));
        System.out.println(integers.peek());

    }
}
