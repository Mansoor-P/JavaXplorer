package com.mansoor.java.killer_java.dsa.practice.collections.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ReversingArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("before reversing " + arr);
        // By using Collections class:

        Collections.reverse(arr);
        System.out.println("after  reverse "+arr);

        // Using ListIterator:

//        ListIterator iterator=arr.listIterator(arr.size());
//
//        while(iterator.hasPrevious())
//        {
//            System.out.println(iterator.previous());
//        }
    }
}
