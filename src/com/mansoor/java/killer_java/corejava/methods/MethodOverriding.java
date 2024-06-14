package com.mansoor.java.killer_java.corejava.methods;
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // Method overriding - providing a specific implementation for makeSound in the Dog class
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    // Method overriding - providing a specific implementation for makeSound in the Cat class
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Calls the makeSound method in the Dog class
        cat.makeSound(); // Calls the makeSound method in the Cat class
    }
}
