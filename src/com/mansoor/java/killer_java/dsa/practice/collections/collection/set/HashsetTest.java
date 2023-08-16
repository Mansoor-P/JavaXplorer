package com.mansoor.java.killer_java.dsa.practice.collections.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetTest {
    public static void main(String[] args) {
//        Set<String> hs = new HashSet<>();
//        hs.add("MANSOOR");
//        hs.add("MANSO7R");
//        System.out.println(hs);


        List<String> L = new ArrayList<String>();

        // Add values to the List
        L.add("Aragorn");
        L.add("Gandalf");
        L.add("Legolas");
        L.add("Frodo");

        // Create a Set and pass List object as parameter
        HashSet<String> S = new HashSet<String>(L);

        // Print values of Set
        System.out.println("HashSet Elements are : ");

        // since the set is of string type, create a String
        // object to iterate through set
        for (String ob : S)
        {
            System.out.println(ob);
        }
    }


}
