package org.example.DeamonThreadsExersices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeamonThreadsTimeCalculate {
    public static void main(String[] args) {
        //ArrayLists
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(random.nextInt(1, 100_000));
        }

        //Massiv

        int[] list = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            list[i] = random.nextInt(1, 100_000);
        }

        long allNumbersInArrayList = 0L;
        long timeArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            allNumbersInArrayList += arrayList.get(i);
        }
        long timeEndArrayList = System.currentTimeMillis();
        System.out.println(allNumbersInArrayList);
        System.out.println(timeEndArrayList - timeArrayList);

        long allNumbersInArray = 0L;
        long timeArray = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            allNumbersInArray += list[i];
        }
        long timeEndArray = System.currentTimeMillis();
        System.out.println(allNumbersInArray);
        System.out.println(timeEndArray - timeArray);
    }
}

class ThreadAddExsersice implements Runnable {

    @Override
    public void run() {
    }
}