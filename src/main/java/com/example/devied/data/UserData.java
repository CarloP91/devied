package com.example.devied.data;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users") //crea o usa una tabella su MongoDB
public class UserData {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
