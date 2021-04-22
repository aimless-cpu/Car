package com.company;

public class Car {
    //Instanz, Gedächtnisvariabl
    private Engine engine;
    private int fuelAmount;
    private int fuelConsumption; //per 100 km
    private String brand;
    private String serialNumber;
    private String color;
    private int honkCounter;

    //Constructor
    public Car(Engine engine, String brand, String color) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;


    }

    //Method
    public void honk() {
        System.out.println("i am" + this.brand + "with the color" + this.color + "and the engine" + this.getEngine().getHorsePower() );
        this.honkCounter++;
    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
