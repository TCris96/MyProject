package com.sda.task.task1;

public class DemoTask1 {
    public static void main(String[] args) {
    ServersSingleton instance = ServersSingleton.getInstance();
        System.out.println(instance.getHttpServers());
        System.out.println(instance.getHttpsServers());
    }
}
