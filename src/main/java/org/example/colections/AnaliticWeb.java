package org.example.colections;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class AnaliticWeb {
    public static TreeSet<Long> treeSet = new TreeSet<Long>();
    Random random = new Random();
    public final long THEBIGGESTID = 100_000_000_000L;
    public final long THESMALLESTID = 1L;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnaliticWeb analiticWeb = new AnaliticWeb();
        System.out.println("How many new users came?");
        analiticWeb.randomize(scanner.nextLong());

        System.out.println(treeSet.toString());
    }

    public void randomize(long times) {
        for (long i = 0L; i < times; i++) {
            long randomNumber = random.nextLong(THESMALLESTID, THEBIGGESTID);
            if (randomNumber % 2 == 0) {
                treeSet.add(randomNumber);
            }

        }
    }
}
