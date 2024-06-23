package com.mansoor.java.killer_java.corejava.OOP.abstraction;

abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void start();

    // Concrete method
    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("The car is starting with a key.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("The motorcycle is starting with a button.");
    }
}

