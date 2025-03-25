package com.example.dataingestionservice.model.mobilepayment;

public class Geolocation {
    private Double latitude;
    private Double longitude;

    // Getters and Setters
    public Double getLatitude() {
        return latitude != null? latitude: null;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude != null? longitude: null;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
