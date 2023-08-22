package com.mansoor.java.killer_java.corejava.collections.collection.list.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedListOverList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        // Use add() method to add elements in the list
        list.add("Mansoor");
        list.add("munaf");
        list.add("reyaz");
        list.add("10");
        list.add("20");

        ListIterator listIter=list.listIterator(2);
        System.out.println("The list is as follows:");
        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }
}
