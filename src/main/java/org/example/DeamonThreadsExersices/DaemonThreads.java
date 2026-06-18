package org.example.DeamonThreadsExersices;

public class DaemonThreads {
    public static void main(String[] args) throws InterruptedException {
        DeamonThreadsRun deamonThreads = new DeamonThreadsRun();

        Thread thread = new Thread(deamonThreads);

        thread.setDaemon(true);

        thread.start();
        System.out.println("Main thread start");
        Thread.sleep(1500);
        System.out.println("Main thread end");
    }

}

class DeamonThreadsRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}