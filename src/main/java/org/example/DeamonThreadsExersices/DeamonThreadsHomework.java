package org.example.DeamonThreadsExersices;

public class DeamonThreadsHomework {
    public static void main(String[] args) throws InterruptedException {
        DeamonThreadsRunHomework deamonThreads = new DeamonThreadsRunHomework();

        Thread thread = new Thread(deamonThreads);

        thread.setDaemon(true);

        thread.start();
        System.out.println("Main thread start");
        Thread.sleep(1501);
        System.out.println("Main thread end");
    }

}

class DeamonThreadsRunHomework   implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                System.out.println("Kritical cleaning of resuarces");
            }
        }
    }
}