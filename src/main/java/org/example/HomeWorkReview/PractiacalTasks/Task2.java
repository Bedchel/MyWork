package org.example.HomeWorkReview.PractiacalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];

        fillArray(numbers, scanner);
        double biggestNumber = findBiggestNumber(numbers);
        System.out.println(STR."Найбільше число це \{biggestNumber}");
    }

    public static void fillArray(double[] array, Scanner scanner) {

        while (true) {
            System.out.println(STR."Напишіть \{array.length} числа:");
            try {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(STR."N\{i + 1}: ");
                    array[i] = scanner.nextDouble();
                }
                break;
            } catch (InputMismatchException e) {
                System.err.println("Помилка! Числа не знайдено.\nПовторіть спробу");
                scanner.nextLine();
            }
        }
    }

    public static double findBiggestNumber(double[] array) {
        double biggestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }
        return biggestNumber;
    }
}