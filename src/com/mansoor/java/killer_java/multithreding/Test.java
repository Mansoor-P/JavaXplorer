package com.mansoor.java.killer_java.multithreding;

public class Test {
    public static void main(String[] args) {
    User u=new User();
    Thread t1=new Thread(u);
        t1.start();
        HR hr=new HR();
        Thread t2=new Thread(hr);
        t2.start();
    }
}

                                    //Creating Threads by implimenting runnable interface
class User implements  Runnable{
    @Override
    public void run(){
        System.out.println("User Runnable");
    }
}
class HR implements Runnable{
    @Override
    public void run(){
        System.out.println("HR runnable");
    }
}

    Creating Threads by anonymous and lamda expressions