package com.mansoor.java.killer_java.multithreding.synchronization;

public class S_Resources {
    public static
    void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        // Start the threads
        producerThread.start();
        consumerThread.start();

        // Wait for threads to finish
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 class SharedResource {
    private boolean itemProduced = false;
    private int item;

    // Producer method
    public synchronized void produce(int newItem) {
        // Wait until the consumer consumes the item
        while (itemProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Produce the item
        item = newItem;
        System.out.println("Produced: " + item);
        itemProduced = true;

        // Notify the waiting consumer
        notify();
    }

    // Consumer method
    public synchronized void consume() {
        // Wait until the producer produces an item
        while (!itemProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Consume the item
        System.out.println("Consumed: " + item);
        itemProduced = false;

        // Notify the waiting producer
        notify();
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.produce(i);
        }
    }
}

 class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.consume();
        }
    }
}


