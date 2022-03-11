package com.sda.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;


import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.*;

public class ServersSingleton {
    private static ServersSingleton singletonInstance;
    private final Set<String> servers;

    private ServersSingleton(){
        servers = new HashSet<>();
        servers.add("http://www.google.com");
    }

    public static ServersSingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new ServersSingleton();
        }
        return singletonInstance;
    }

    public boolean addServer(String server){
        if(!isValidServerName(server)){
            return false;
        }
        return servers.add(server);
    }

    private boolean isValidServerName(String server) {
        return server.startsWith("http") || isHttpsServer(server);
    }

    public List<String> getHttpServers(){
        return servers.stream()
                .filter(not(this::isHttpsServer))
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
