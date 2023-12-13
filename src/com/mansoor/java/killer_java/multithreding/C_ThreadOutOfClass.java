package com.mansoor.java.killer_java.multithreding;

public class C_ThreadOutOfClass {

        public static void main(String[] args) {


            Employee e1=new Employee();
            e1.start();
            System.out.println(Thread.activeCount());

            Manager m1=new Manager();
            m1.start();
            System.out.println(Thread.activeCount());

        }
    }


    class Employee extends Thread{
        @Override
        public void run(){
            System.out.println("Employee Thread");
        }

    }

    class Manager extends Thread{
        @Override
        public void run(){
            System.out.println("Manager Thread");
        }
    }
