package com.company;

public class Car {
    //Instanz, Gedächtnisvariabl
    public int fuelAmount;
    public int fuelConsumption; //per 100 km
    public String brand;
    public String serialNumber;
    public String color;

    //Constructor
    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;


    }

    //Method

    public void drive() {
        this.fuelAmount = fuelAmount - fuelConsumption;
        System.out.println("I drive.");
    }




}
