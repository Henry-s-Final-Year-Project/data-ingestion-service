package com.example.dataingestionservice.model;

public class Merchant {
    private String id;
    private String name;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name != null ? name : "MISSING";
    }

    public void setName(String name) {
        this.name = name;
    }
}
