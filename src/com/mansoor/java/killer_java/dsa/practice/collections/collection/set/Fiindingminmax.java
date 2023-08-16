package com.mansoor.java.killer_java.dsa.practice.collections.collection.set;

import java.util.Collections;
import java.util.HashSet;

public class Fiindingminmax {
    public static void main(String[] args)
    {

        // New HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add data to Hashset
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        // Print Maximum value using max method of
        // Collections class
        System.out.println("Maximum value of HashSet : "
                + Collections.max(set));

        // Print Maximum value using max method of
        // Collections class
        System.out.println("Minimum value of HashSet : "
                + Collections.min(set));
    }
}
