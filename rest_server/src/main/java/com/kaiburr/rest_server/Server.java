package com.kaiburr.rest_server;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Server")
public class Server {
    @Id
    String id;
    
    
    String name;
    String language;
    String framework;
    
    public Server(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }
    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getFramework() {
        return framework;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Server [framework=" + framework + ", id=" + id + ", language=" + language + ", name=" + name + "]";
    }


    

    
}
