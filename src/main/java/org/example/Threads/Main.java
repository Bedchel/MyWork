package org.example.Threads;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new ForBull();

        Thread t1 = new Thread(runnable);

        t1.start();

    }

    public static void ariphmetik(int n, int N) {
        long answer = 0;
        for (int i = 1; i < N + 1; i++) {
            answer += ((long) n * i);

            System.out.println(answer);
        }
    }
}

class ForBull implements Runnable {
    int n = 5;
    int N = 10;

    @Override

    public void run() {
        long answer = 0;
        for (int i = 1; i < N + 1; i++) {
            answer += ((long) n * i);

            System.out.println(answer);
        }
    }
}