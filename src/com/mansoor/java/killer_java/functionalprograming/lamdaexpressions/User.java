package com.mansoor.java.killer_java.functionalprograming.lamdaexpressions;

import com.mansoor.java.killer_java.functionalprograming.Car;

public class User {
    public static void main(String[] args) {
        Car c=new Car(){
            @Override
            public void drive() {
                System.out.println(" BMW Drive is called");
            }
        };
        c.drive();

    }
}
