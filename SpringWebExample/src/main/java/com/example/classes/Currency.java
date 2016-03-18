package com.example.classes;

/**
 * Класс описания валюты
 * Created by HP-PK on 17.03.2016.
 */
public class Currency {

    private String name;
    private String shortName;
    private Double value;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
