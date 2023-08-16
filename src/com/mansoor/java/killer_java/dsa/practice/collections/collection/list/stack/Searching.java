package com.mansoor.java.killer_java.dsa.practice.collections.collection.list.stack;

import java.util.Stack;

public class Searching {
    public static void main(String[] args) {
        Stack<String> STACK = new Stack<String>();

        // Stacking strings
        STACK.push("Mansoor");
        STACK.push("4");
        STACK.push("Munaf");
        STACK.push("Welcomes");
        STACK.push("You");

        // Displaying the Stack
        System.out.println("The stack is: " + STACK);

        System.out.println("searching " + STACK.search("Mansoor"));

    }
}
