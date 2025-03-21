package com.example.dataingestionservice.model;

public class Card {
    private int firstNumbers;
    private int lastNumbers;
    private String scheme;

    // Getters and Setters
    public int getFirstNumbers() {
        return firstNumbers;
    }

    public void setFirstNumbers(int firstNumbers) {
        this.firstNumbers = firstNumbers;
    }

    public int getLastNumbers() {
        return lastNumbers;
    }

    public void setLastNumbers(int lastNumbers) {
        this.lastNumbers = lastNumbers;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
