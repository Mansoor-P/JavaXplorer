package com.mansoor.java.killer_java.multithreding.synchronization;

public class SynchronizationTest {
    public static void main(String[] args)  throws  Exception{

        BrickDairy bd=new BrickDairy();

        Runnable r1=()->{
            for (int i = 0; i < 10000; i+=50) {
                // Unloading the 50 bricks
                bd.incrementBrickCount();
            }
        };
        Runnable r2=()->{
            for (int i = 0; i < 15000; i+=50) {
                // Unloading the 50 bricks
                bd.incrementBrickCount();
            }
        };
        Runnable r3=()->{
            for (int i = 0; i < 5000; i+=50) {
                // Unloading the 50 bricks
                bd.incrementBrickCount();

            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println(bd.brickCount);
        System.out.println(bd.brickCount2);

    }
}

 class  BrickDairy{
    int brickCount =0;
     int brickCount2 =0;
                                                        // method level synchronization
//     public synchronized void incrementBrickCount(){
//        brickCount =brickCount+50;
//         brickCount2 =brickCount2+50;
//    }
                                                         // method level synchronization
     public  void incrementBrickCount(){
        synchronized(this){
            brickCount =brickCount+50;
        }
            brickCount2 =brickCount2+50;
     }

//     class  BrickDairy{
//         volatile int brickCount =0;
//
//         volatile int brickCount2 =0;
//         public  void incrementBrickCount(){
//             synchronized(this){
//                 brickCount =brickCount+50;
//             }
//             brickCount2 =brickCount2+50;
//         }
}