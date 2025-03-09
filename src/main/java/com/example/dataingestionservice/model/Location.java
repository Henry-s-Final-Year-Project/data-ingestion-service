package com.example.dataingestionservice.model;

public class Location {
    private String address;
    private String city;
    private String countryCode;
    private String postcode;
    private Geolocation geolocation;

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }
}

class Geolocation {
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

