package com.mansoor.java.killer_java.corejava.exceptionhandling.multithreding;

public class Main {
    public static void main(String[] args) {
//        Thread t1=new Thread();
//        t1.start();
//        System.out.println(Thread.currentThread().getName());

        Employee e1=new Employee("Employee-thread - ");
        e1.start();

        Manager m1=new Manager("Manager-Thread - ");
        m1.start();

        System.out.println(Thread.activeCount());

    }
}
class Employee extends  Thread{
    public Employee(String ename){
        super(ename);
    }
    @Override
    public void run(){
        System.out.println("Run By Employee" +Thread.currentThread().getName()+Thread.currentThread().getId());
    }
}

class Manager extends Thread{
    public Manager(String mname){
        super(mname);
    }
    @Override
    public void run(){
        System.out.println("Run By Manager"+Thread.currentThread().getName()+Thread.currentThread().getId());
    }

}
