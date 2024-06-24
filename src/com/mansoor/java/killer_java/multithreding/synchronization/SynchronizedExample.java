package com.mansoor.java.killer_java.multithreding.synchronization;

class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create threads that increment the counter
        Thread t1 = new Thread();
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }

        Thread t2 = new Thread();
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }


        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
