package com.mansoor.java.killer_java.multithreding;

public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
class Employee extends  Thread{
    @Override
    public void run(){
        System.out.println("run method from employee");
    }

}
