package com.sda.task.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class ServersSingleton {
    private static ServersSingleton singletonInstance;
    private final Set<String> servers;

    private ServersSingleton(){
    servers = new HashSet<>();
    servers.add("http://www.google.com");
    }
    public static ServersSingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance= new ServersSingleton();
        }
        return singletonInstance;
    }


    public boolean addServer(String server){
        if(server.startsWith("http") ||  isHttpsServer(server))
        {
            return servers.add(server);
        }
        return false;
    }
    public List<String> getHttpServers(){
       return servers.stream()
                .filter(server ->  !isHttpsServer(server))
                .collect(toList());

    }
    public List<String> getHttpsServers(){
        return servers.stream()
                .filter(this::isHttpsServer)
                .collect(toList());

    }

    private boolean isHttpsServer(String server) {
        return server.startsWith("https");
    }
}
