package org.example.Threads;


public class MainTaskFor100Treats {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {

            Thread thread = new Thread(counter);
            thread.start();
            thread.join();


        }
        System.out.println(counter.count);

    }
}

class Counter implements Runnable {

    int count = 0;

    public synchronized void increement() {
        count += 1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increement();
        }
    }
}