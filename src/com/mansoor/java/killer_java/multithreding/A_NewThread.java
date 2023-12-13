package com.mansoor.java.killer_java.multithreding;
public class A_NewThread {
    public static void main(String[] args) {
        System.out.println("Hello Mansoor");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
