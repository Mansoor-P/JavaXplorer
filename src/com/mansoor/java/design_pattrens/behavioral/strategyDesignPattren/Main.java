package com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren;

import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.classes.GoodsVehical;
import com.mansoor.java.design_pattrens.behavioral.strategyDesignPattren.classes.SportsVehical;

public class Main {
    public static void main(String[] args) {
        Vehical vehical=new GoodsVehical();
        vehical.drive();
    }
}
