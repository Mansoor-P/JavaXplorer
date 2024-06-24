package com.mansoor.java.killer_java.corejava.OOP.polymorphism;

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Call the different add methods
        System.out.println("Sum of 2 integers: " + mathOps.add(5, 10));
        System.out.println("Sum of 3 integers: " + mathOps.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + mathOps.add(5.5, 10.5));
    }
}
