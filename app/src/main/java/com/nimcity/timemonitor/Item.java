package com.nimcity.timemonitor;

public class Item {

    private String name;
    private Double minutes;

    public Item(String name) {
        this.name = name;
        this.minutes = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public Double getMinutes() {
        return this.minutes;
    }

}
