package com.mansoor.java.killer_java.dsa.practice.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>();

        // Populating arrlist1
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");
        arrlist.add("E");

        // print arrlist
        System.out.println("Original arrlist: "
                + arrlist);

        // getting the subList
        // using subList() method

        List<String> arrlist2 = arrlist.subList(2, 4);

        // print the subList
        System.out.println("Sublist of arrlist: "
                + arrlist2);
    }
}
