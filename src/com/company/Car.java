package com.company;

public class Car {
    public int fuelAmount;
    public int fuelConsumption; //per 100 km
    public String brand;
    public String serialNumber;
    public String color;

    public void drive() {
        this.fuelAmount = fuelAmount - fuelConsumption;
        System.out.println("I drive.");
    }


}
