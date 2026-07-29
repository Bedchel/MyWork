package org.example.Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class firstLevel {
    static void main() throws InterruptedException {//1#
        Thread thread = Thread.ofVirtual().name("my-vthread").start(() -> {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.join();
        //2#
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                int finalI = i;
                executorService.submit(
                        () -> {
                            System.out.println(finalI);
                        }
                );
            }
        }
        //#3

    }
}
