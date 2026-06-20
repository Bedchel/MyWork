package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = null;
        boolean cycle = true;

        while (cycle) {
            try {
                System.out.println("Напиши скільки елементів: ");
                array = new int[scanner.nextInt()];

                cycle = false;
            } catch (Exception e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");
                scanner.nextLine();
            }
        }

        int amountOfNumbersThatCanBeDividedByTwo = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер " + (i + 1) + "\nНапиши повне число: ");
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                amountOfNumbersThatCanBeDividedByTwo += 1;
            }
        }
        System.out.println("Кількість парних чисел " + amountOfNumbersThatCanBeDividedByTwo);
    }
}