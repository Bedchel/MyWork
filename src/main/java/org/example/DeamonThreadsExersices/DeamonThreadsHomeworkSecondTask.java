package org.example.DeamonThreadsExersices;

public class DeamonThreadsHomeworkSecondTask {
    public static void main(String[] args) throws InterruptedException {
        Parent parent = new Parent();

        Thread thread = new Thread(parent);

        thread.setDaemon(true);

        thread.start();
        Thread.sleep(500);
    }


}

class Parent implements Runnable {
    @Override
    public void run() {
        Child child = new Child();
        Thread threadChild = new Thread(child);

        threadChild.start();
    }
}

class Child implements Runnable {
    @Override
    public void run() {
        System.out.println("Am I Demon? " + Thread.currentThread().isDaemon());
    }
}