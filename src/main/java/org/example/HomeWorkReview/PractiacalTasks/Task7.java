package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean cycle = true;

        while (cycle) {
            System.out.println("Напиши скільки елементів: ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Кількість елементів має бути більшою за 0!");
                    continue;
                }
                cycle = false;
            } catch (Exception e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");

                scanner.nextLine();
            }
        }

        int[] array = new int[size];
        int theSummeOfNumbers = 0;

        for (
                int i = 0;
                i < array.length; i++) {
            boolean cycleForNumber = true;

            while (cycleForNumber) {
                System.out.println("Номер " + (i + 1) + "\nНапиши повне число: ");
                try {
                    array[i] = scanner.nextInt();
                    theSummeOfNumbers += array[i];
                    cycleForNumber = false;
                } catch (Exception e) {
                    System.err.println("Помилка! Це не ціле число. Спробуйте ще раз.");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("Сума дорівнює " + theSummeOfNumbers);
    }
}