package com.mansoor.java.killer_java.corejava.collections.collection.list.LinkedList;
import  java.util.*;
public class LL {
    public static void main(String[] args) {

     List<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(1);

     Collections.sort(ll);
         if (ll.isEmpty()){
             System.out.println("ll is empty");
         }
         else {
             System.out.println("ll is " + ll);
         }

//        LinkedList <String> ll=new LinkedList<>();

//        ll.add("mansoor");
//        ll.add("pal");
//        ll.add("munaf");
//        ll.add("fareed");
//        ll.add("manohar");
//        ll.add("manikanta");
//        System.out.println(ll);
//        System.out.println(ll.poll());
//        System.out.println(ll.poll());
//        System.out.println(ll);


    }
}
