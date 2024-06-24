package com.mansoor.java.killer_java.corejava.OOP.abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of Car and Motorcycle
        Drivable myCar = new Car1();
        Drivable myMotorcycle = new Motorcycle1();

        // Start the vehicles
        myCar.start();
        myMotorcycle.start();

        // Stop the vehicles
        myCar.stop();
        myMotorcycle.stop();
    }
}
