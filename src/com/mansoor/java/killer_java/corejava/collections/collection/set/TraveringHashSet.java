package com.mansoor.java.killer_java.corejava.collections.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TraveringHashSet {
    public static void main(String[] args) {
        HashSet <String> set=new HashSet<>();
        set.add("mansoor");
        set.add("munaf");
        set.add("manohar");
// for each loop
        for (String i :set){
            System.out.println(i);
        }

        // forEach() method
        set.forEach(i->System.out.println(i));

        // using iterator
        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
