package org.example.HomeWorkReview.PractiacalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        int lastNumber = getLastNumber();

        int summeOfNumbers = calculateSum(lastNumber);

        System.out.println(STR."Сума від 1 до \{lastNumber} це \{summeOfNumbers}");
    }

    public static int getLastNumber() {
        while (true) {
            try {
                System.out.println("До якого числа обчислювати?");
                int number = scanner.nextInt();

                if (number <= 0) {
                    System.out.println("Помилка! Число має бути більшим за 0.");
                    continue;
                }

                return number;
            } catch (InputMismatchException e) {
                System.err.println("Помилка! Число не знайдено.\nПовторіть спробу");
                scanner.nextLine();
            }
        }
    }

    public static int calculateSum(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        return sum;
    }
}