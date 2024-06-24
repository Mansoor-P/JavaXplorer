package com.mansoor.java.killer_java.corejava.OOP.polymorphism;

// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method on Dog and Cat
        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
    }
}
