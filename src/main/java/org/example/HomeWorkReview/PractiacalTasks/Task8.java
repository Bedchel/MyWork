package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task8 {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        int[] array = createArray();

        int evenCount = fillArrayAndCountEven(array);

        System.out.println("Кількість парних чисел: " + evenCount);
    }

    public static int[] createArray() {
        while (true) {
            try {
                System.out.println("Напиши скільки елементів: ");
                int size = scanner.nextInt();

                if (size <= 0) {
                    System.out.println("Кількість елементів має бути більшою за 0!");
                    continue;
                }

                return new int[size];
            } catch (Exception e) {
                System.err.println("Помилка! Число не знайдено.\nПовторіть спробу");
                scanner.nextLine();
            }
        }
    }

    public static int fillArrayAndCountEven(int[] array) {
        int amountOfNumbersThatCanBeDividedByTwo = 0;

        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.println("Номер " + (i + 1) + "\nНапиши повне число: ");
                try {
                    array[i] = scanner.nextInt();
                    if (array[i] % 2 == 0) {
                        amountOfNumbersThatCanBeDividedByTwo += 1;
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Помилка! Це не ціле число. Спробуйте ще раз.");
                    scanner.nextLine();
                }
            }
        }
        return amountOfNumbersThatCanBeDividedByTwo; // Повертаємо результат назад у main
    }
}