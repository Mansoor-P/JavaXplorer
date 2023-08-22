package com.mansoor.java.killer_java.corejava.collections.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomElement {
    public static void main(String[] args)
    {
        // creating the HashSet
        Set<Integer> hs = new HashSet<Integer>();

        hs.add(11);
        hs.add(24);
        hs.add(34);
        hs.add(43);
        hs.add(55);
        hs.add(66);
        hs.add(72);
        hs.add(80);
        hs.add(99);

        // convert HashSet to an array
        Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);

        // generate a random number
        Random rndm = new Random();

        // this will generate a random number between 0 and
        // HashSet.size - 1
        int rndmNumber = rndm.nextInt(hs.size());

        // get the element at random number index
        System.out.println("Random element: "
                + arrayNumbers[rndmNumber]);
    }
}
