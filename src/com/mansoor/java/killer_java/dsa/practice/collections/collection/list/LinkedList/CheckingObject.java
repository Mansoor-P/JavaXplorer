package com.mansoor.java.killer_java.dsa.practice.collections.collection.list.LinkedList;

import java.util.LinkedList;

public class CheckingObject {
    public static void main(String[] args) {
        // Creating an empty LinkedList

        LinkedList<String> list = new LinkedList<String>();

        // Use add() method to add elements in the list
        list.add("Mansoor");
        list.add("munaf");
        list.add("reyaz");
        list.add("10");
        list.add("20");

        // Output the list
        System.out.println("LinkedList:" + list);

        // Check if the list contains "Hello"
        System.out.println("\nDoes the List contains 'Hello': "
                + list.contains("Hello"));

        // Check if the list contains "20"
        System.out.println("Does the List contains '20': "
                + list.contains("20"));

        // Check if the list contains "Mansoor"
        System.out.println("Does the List contains 'Mansoor': "
                + list.contains("Mansoor"));
    }
}
