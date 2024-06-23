package com.mansoor.java.killer_java.corejava.OOP.polymorphism;

// Base class: Person
class Person {
    public void role() {
        System.out.println("A person has multiple roles.");
    }
}

// Derived class: Father
class Father extends Person {
    @Override
    public void role() {
        System.out.println("Father: Taking care of the children.");
    }
}

// Derived class: Husband
class Husband extends Person {
    @Override
    public void role() {
        System.out.println("Husband: Taking care of the wife.");
    }
}

// Derived class: Employee
class Employee extends Person {
    @Override
    public void role() {
        System.out.println("Employee: Working at the office.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create objects for each role
        Person personasPerson=new Person();
        Person personAsFather = new Father();
        Person personAsHusband = new Husband();
        Person personAsEmployee = new Employee();

        // Call the role method on each object
        personasPerson.role();
        personAsFather.role();
        personAsHusband.role();
        personAsEmployee.role();
    }
}
