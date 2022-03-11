package com.sda.singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        doActionA();

        doActionB();

    }
    private static void doActionA(){
        ServersSingleton serversInstance = ServersSingleton.getInstance();
        System.out.println(serversInstance.getHttpServers());
    }
    private static void doActionB(){
        ServersSingleton serversInstance = ServersSingleton.getInstance();
        System.out.println(serversInstance.getHttpServers());
    }
}
