package com.mansoor.java.killer_java.corejava.collections.collection.queue;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad1=new ArrayDeque<>();
      ArrayDeque<Integer> ad2=new ArrayDeque<>();

        ad1.add(166);
        ad1.add(34);
        ad1.add(37);
        ad1.add(19);
        ad1.add(3);
        ad1.push(34);
        System.out.println(ad1);
        System.out.println(ad1.pop());
        System.out.println( ad1.isEmpty());
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekLast());
        System.out.println(ad1.removeLast());




    }
}
