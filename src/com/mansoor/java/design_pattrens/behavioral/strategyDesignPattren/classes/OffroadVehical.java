package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.classes;

import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.Vehical;
import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.interface_methods.SportsDriveStrategy;

public class OffroadVehical extends Vehical {
     OffroadVehical() {

        super(new SportsDriveStrategy());
    }
}
