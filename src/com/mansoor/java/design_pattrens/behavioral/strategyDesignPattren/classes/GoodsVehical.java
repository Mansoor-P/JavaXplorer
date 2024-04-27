package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.classes;

import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.Vehical;
import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.interface_methods.NormalDriveStrategy;

public class GoodsVehical extends Vehical {
    public GoodsVehical() {
        super(new NormalDriveStrategy());
    }
}
