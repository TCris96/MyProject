package com.sda.mediator;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private List<Message> history;
    private EmailServer currentServer;

    public User(String id, String name){
        this.id = id;
        this.name = name;
        history= new ArrayList<>();
    }
    public void receivedMessage(Message message){
        history.add(message);
    }
    public void displayMessageHistory(){
        System.out.println("These are the messages for user "+id);
        history.forEach(System.out::println);
    }

    public String getId() {
        return id;
    }
    public void sendMessage(Message message,String id){
        currentServer.sendMessage(message,id);
    }
    public void connectToServer(EmailServer server){
        this.currentServer = server;
        server.addUsers(this);
    }
}
