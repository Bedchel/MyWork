package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task2 {
    // Додали public, щоб програма запускалася
    public static void main(String[] args) {
        // Створюємо масив потрібного розміру (на 3 комірки)
        double[] numbers = new double[3];
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;
        while (cycle) {
            System.out.println("Напишіть 3 числа:");
            try {
                System.out.print("N1: ");
                numbers[0] = scanner.nextDouble();

                System.out.print("N2: ");
                numbers[1] = scanner.nextDouble();

                System.out.print("N3: ");
                numbers[2] = scanner.nextDouble();
                cycle = false;
            } catch (Exception e) {
                System.err.println("Помилка числа незнайдено\n" +
                        "Повторить спробу");
            }
        }
        double biggestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }

        System.out.println(STR."Найбільше число це \{biggestNumber}");
    }
}