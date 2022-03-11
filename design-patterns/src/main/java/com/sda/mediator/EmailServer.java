package com.sda.mediator;

import java.util.ArrayList;
import java.util.List;

public class EmailServer {
   private List<User> users;

   public EmailServer(){
       users = new ArrayList<>();
   }

   public void addUsers(User user){
       users.add(user);
   }

   public void sendMessage(Message message,String userId){
       users.stream()
               .filter(user -> user.getId().equals(userId))
               .forEach(user -> user.receivedMessage(message));

   }
}
