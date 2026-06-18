package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши скільки елементів: ");
        int[] array = new int[scanner.nextInt()];
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
