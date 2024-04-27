package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.interface_methods;

import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
