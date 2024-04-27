package com.mansoor.java.Operating_System;

import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Buffer size is 5
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce(i);
                    Thread.sleep(1000); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(2000); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private Queue<Integer> queue;
    private int maxSize;

    public Buffer(int size) {
        this.queue = new LinkedList<>();
        this.maxSize = size;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait(); // Wait if buffer is full
        }
        queue.offer(item);
        System.out.println("Produced: " + item);
        notify(); // Notify consumer that an item is available
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait if buffer is empty
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify(); // Notify producer that a slot is available
        return item;
    }
}
