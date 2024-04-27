package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.classes;

import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.Vehical;
import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.interface_methods.NormalDriveStrategy;

public class NormalVehical extends Vehical {

    public NormalVehical() {
        super(new NormalDriveStrategy());
    }
}
