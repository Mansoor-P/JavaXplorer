package com.mansoor.java.killer_java.corejava.collections.collection.list.arraylist;

import java.util.ArrayList;

public class UpdatingEliments {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("added array list" + arr);

        int updated =arr.set(2,20);

        System.out.println("updated " + updated);
        System.out.println(arr);

    }
}
