package com.mansoor.java.killer_java.corejava.collections.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueTest {
    public static void main(String[] args) {
        Queue<Integer> pr=new PriorityQueue<>();
//        pr.add(null);  //not allows null values [NullPointerException]
//        pr.add(12);   //it allows duplicate values

        pr.add(20);
        pr.add(4);
        pr.add(2);
        pr.offer(1);
        pr.poll();
        System.out.println(pr);
//        pr.element();
//        pr.peek();
//        pr.remove();

    }
}
