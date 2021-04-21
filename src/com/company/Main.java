package com.company;



public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.fuelAmount = 100;
        c1.fuelConsumption = 5;
        c1.brand = "Audi";
        c1.serialNumber = "A1230";
        c1.color = "greem";

        Car c2 = new Car();
        c2.fuelAmount = 90;
        c2.fuelConsumption = 10;
        c2.brand = "Mercedes";
        c2.serialNumber = "M123";
        c2.color = "red";

        c2.drive();
        System.out.println(c2.fuelAmount);


    }
}
