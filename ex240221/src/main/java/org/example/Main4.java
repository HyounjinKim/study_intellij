package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) {

        Runnable run = () -> {
//            for (int i = 0;i < 1000;i++){
            System.out.println(Thread.currentThread().getName() + "zzz A 쓰레드 ");
//            }
        };

        Runnable run2 = () -> {
//            for (int i = 0;i < 1000;i++){
            System.out.println(Thread.currentThread().getName() + "zzz B 쓰레드 ");
//            }
        };
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(run);
        es.submit(run2);
        es.submit(() -> {
            {
                System.out.println(Thread.currentThread().getName() + "zzz C 쓰레드 ");
            }
        });
        es.shutdown();
    }
}
