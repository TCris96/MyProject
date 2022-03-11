package com.sda.mediator;

public class DemoApp {
    public static void main(String[] args) {
        EmailServer server = new EmailServer();
        User user1 = new User("1","user1");
        User user2 = new User("2","user2");
        User user3 = new User("3","user3");

        user1.connectToServer(server);
        user2.connectToServer(server);
        user3.connectToServer(server);

        user1.sendMessage(new Message("Hello"),"1");
        user2.sendMessage(new Message("Hello from user2"),"2");
        user3.sendMessage(new Message("Hello from user3"),"3");

        user1.displayMessageHistory();
        user2.displayMessageHistory();
        user3.displayMessageHistory();

    }
}
