package com.company;

public class Engine {
    //Instanz
    private enum TYPE {DIESEL, GAS};
    private int horsePower;
    private TYPE type;



    //Constructor
    public Engine( int horsePower, TYPE)

    //Method
    public void drive(int amount) {
        System.out.println("motor is running with" + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}
