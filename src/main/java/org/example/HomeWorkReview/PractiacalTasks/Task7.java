package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task7 {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        int size = findingTheBigOfArray();

        int[] array = new int[size];

        int theSummeOfNumbers = fillingTheArrayAndCalculating(array);

        System.out.println("Сума дорівнює " + theSummeOfNumbers);
    }

    public static int findingTheBigOfArray() {
        int size = 0;
        while (true) {
            System.out.println("Напиши скільки елементів: ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Кількість елементів має бути більшою за 0!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.err.println("Помилка число незнайдено\nПовторить спробу");
                scanner.nextLine();
            }
        }
        return size;
    }

    public static int fillingTheArrayAndCalculating(int[] array) {
        int theSummeOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {


            while (true) {
                System.out.println("Номер " + (i + 1) + "\nНапиши повне число: ");
                try {
                    array[i] = scanner.nextInt();
                    theSummeOfNumbers += array[i];
                   break;
                } catch (Exception e) {
                    System.err.println("Помилка! Це не ціле число. Спробуйте ще раз.");
                    scanner.nextLine();
                }
            }
        }
        return theSummeOfNumbers;
    }
}