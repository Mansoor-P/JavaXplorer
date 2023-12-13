package com.mansoor.java.killer_java.multithreding;

public class B_CreatingThread {
    public static void main(String[] args) {

       //  creating threads and checking active count

        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        Thread t4=new Thread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(Thread.activeCount());



    }
}



