package com.mansoor.java.killer_java.corejava.basics;

public class Typecasting {
    static int i = 10; // Static variable
    boolean b = true; // Instance variable

    static double d = 20.128; // Keeping the type as double

    public static void main(String[] args) {

        short s = 2; // local variable

        d = i;
        System.out.println(d); // result 10.0

        i = (int) d;

        System.out.println(i); // result 10

        System.out.println(d + " " + i);
    }
}
