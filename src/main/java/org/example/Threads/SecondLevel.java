package org.example.Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SecondLevel {
    static void main() {
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()
        ) {
            for (int i = 0; i < 1000; i++) {
                int finalI = i;
                executorService.submit(
                        () -> {
                            makeBaseDataWork(finalI);
                        }
                );
            }
        }


    }

    public static void makeBaseDataWork(int numberOfTask) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
