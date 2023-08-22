package com.mansoor.java.killer_java.functionalprograming.lamdaexpressions;
interface Laptop{
    public int usbports();
}
class Vostro implements Laptop{

    @Override
    public int usbports() {
        int speed=100;
        System.out.println("from class" +speed);
        return speed;
    }
}
public class ReturnTypeLamda {
    public static void main(String[] args) {
        Vostro v=new Vostro();
        v.usbports();

        Laptop l=new Laptop() {
            @Override
            public int usbports() {
                int speed=50;
                System.out.println("Return from anonymous class" + speed);
                return speed;
            }
        };
        l.usbports();

        Laptop lp = () -> {
            int speed=200;
            System.out.println("drm lamda expressions" + speed);
        return speed;
        };
        lp.usbports();


    }
}

