package com.example.demo.city;

public class City {
    private String name;
    private String state;
    private int population;

    private String[] bigCities;

    public String[] getBigCities() {
        return bigCities;
    }

    public void setBigCities(String[] bigCities) {
        this.bigCities = bigCities;
    }

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}