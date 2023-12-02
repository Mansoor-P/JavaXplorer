package com.mansoor.java.killer_java.corejava.polymorphism;
class Bike{
    void run(){System.out.println("running");}
}

public class Pulser extends Bike{
    void run()
    {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]){
        Bike b = new Pulser();//upcasting
        b.run();
    }
}
