package com.mansoor.java.killer_java.corejava.OOP.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        // Create objects of Car and Motorcycle
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        // Start the vehicles
        myCar.start();
        myMotorcycle.start();

        // Stop the vehicles
        myCar.stop();
        myMotorcycle.stop();
    }
}

