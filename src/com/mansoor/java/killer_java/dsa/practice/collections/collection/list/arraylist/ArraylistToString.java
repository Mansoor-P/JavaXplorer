package com.mansoor.java.killer_java.dsa.practice.collections.collection.list.arraylist;

import java.util.ArrayList;

public class ArraylistToString {
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<String>();

        // Populating the ArrayList by custom elements
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");

        String[] str = new String[al.size()];

        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }

        // Printing using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}
