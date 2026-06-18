package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task7 {
    static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Напиши скільки елементів: ");
            int[] array = new int[scanner.nextInt()];
            int theSummeOfNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println("Номер " + (i + 1) + "\nНапиши повне число: ");
                array[i] = scanner.nextInt();
                theSummeOfNumbers += array[i];
            }
        System.out.println("Сумма дорівнює " + theSummeOfNumbers);
    }
}
