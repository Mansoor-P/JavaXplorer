package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren;

public class Vehical {
    DriveStrategy driveStrategy;

    public Vehical(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
