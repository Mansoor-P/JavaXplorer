package com.mansoor.java.killer_java.corejava;

public class Constructor {

        // Attributes
        private String name;
        private int age;

        // Default constructor
        public Constructor() {
            this.name = "Unknown";
            this.age = 0;
        }

        // Parameterized constructor
        public Constructor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display person details
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            // Using default constructor
            Constructor person1 = new Constructor();
            person1.display();

            // Using parameterized constructor
            Constructor person2 = new Constructor("Alice", 30);
            person2.display();
        }


}
