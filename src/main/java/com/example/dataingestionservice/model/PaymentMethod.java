package com.example.dataingestionservice.model;

public class PaymentMethod {
    private String type;
    private String provider;
    private Card card;

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

class Card {
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
