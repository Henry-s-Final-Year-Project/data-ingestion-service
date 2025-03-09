package com.example.dataingestionservice.model;

public class DeviceInfo {
    private String type;
    private String os;
    private String model;

    // Getters and Setters
    public String getType() {
        return type != null ? type : "MISSING";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getModel() {
        return model != null ? model : "MISSING";
    }

    public void setModel(String model) {
        this.model = model;
    }
}
