package com.mansoor.java.killer_java.basics.methods;

public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded version of the add method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles (overloaded version of the add method)
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
      MethodOverloading mo=new MethodOverloading();

        System.out.println("Sum of two integers: " + mo.add(5, 7));
        System.out.println("Sum of three integers: " + mo.add(5, 7, 10));
        System.out.println("Sum of two doubles: " + mo.add(3.5, 2.8));
    }
}
