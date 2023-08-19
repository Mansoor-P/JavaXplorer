package com.mansoor.java.killer_java.functionalprograming;

interface  Bike{
    public void speed(int speed,String model);
}
class Pulser implements Bike{

    @Override
    public void speed(int s ,String m) {
        System.out.println("from pulser" + s +" - " +m);
    }
}
public class RuntimeReturntype {
    public static void main(String[] args) {
Pulser p=new Pulser();
p.speed(100 ,"250cc");

Bike bike=new Bike() {
    @Override
    public void speed(int speed , String m) {
        System.out.println("from Bike anonymous class" +speed+" - "+m);
    }
};
bike.speed(200,"150cc");

Bike b= (speed,model) -> {
    System.out.println("from lamda expression" + speed +" - " + model);
};
b.speed(300 ,"300CC");

    }
}
