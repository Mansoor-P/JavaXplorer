package com.mansoor.java.killer_java.corejava.OOP.abstraction;

interface Drivable {
    void start();
    void stop();
}
class Car1 implements Drivable {
    @Override
    public void start() {
        System.out.println("The car is starting with a key.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }
}

class Motorcycle1 implements Drivable {
    @Override
    public void start() {
        System.out.println("The motorcycle is starting with a button.");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle is stopping.");
    }
}
