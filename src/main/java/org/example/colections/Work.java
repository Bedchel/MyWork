package org.example.colections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Work {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1_000; i++) {
            arrayList.add(random.nextInt(1, 1001));
        }

        ArrayList<Integer> array2 = new ArrayList<>(new LinkedHashSet<>(arrayList));
        for (int a : array2) {
            System.out.println(a);
        }
    }
}
