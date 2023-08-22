package com.mansoor.java.killer_java.corejava.multithreding;

public class BYAnonymous {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread execeted by anonymous class");
                }
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}
