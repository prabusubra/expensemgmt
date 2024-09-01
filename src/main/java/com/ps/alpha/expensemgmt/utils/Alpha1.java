package com.ps.alpha.expensemgmt.utils;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Print Even and Odd Numbers from 2 different threads
 */
public class Alpha1 {

    @SneakyThrows({InterruptedException.class})
    public static void main(String[] args) {

        Object lock = new Object();

        AtomicInteger counter= new AtomicInteger(0);

        final int MAX = 100;

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (counter.get() < MAX){
                    if (counter.get() %2 == 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("ODD : "+counter.get());
                        counter.getAndIncrement();
                        lock.notify();
                    }
                }
            }

        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                while (counter.get() < MAX){
                    if (counter.get() %2 == 1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("EVEN : "+counter.get());
                        counter.getAndIncrement();
                        lock.notify();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }




}
