package com.mansoor.java.killer_java.corejava.collections.collection.list.stack;

import java.util.Stack;

public class EmptyStackChecking {
    public static void main(String[] args)
    {

        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();

        // Stacking strings
        STACK.push("Mansoor");
        STACK.push("4");
        STACK.push("Munaf");
        STACK.push("Welcomes");
        STACK.push("You");

        // Displaying the Stack
        System.out.println("The stack is: " + STACK);

        // Checking for the emptiness of stack
        System.out.println("Is the stack empty? " +
                STACK.empty());

        // Popping out all the elements
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();

        // Checking for the emptiness of stack
        System.out.println("Is the stack empty? " +
                STACK.empty());
    }
}
