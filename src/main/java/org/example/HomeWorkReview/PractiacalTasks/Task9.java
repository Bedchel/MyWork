package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task9 {
    // Виносимо сканер на рівень класу
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {

        String[] array = createStringArray();

        fillArray(array);

        searchInArray(array);
    }

    public static String[] createStringArray() {
        while (true) {
            try {
                System.out.println("Напиши скільки елементів: ");
                int size = scanner.nextInt();
                scanner.nextLine();

                if (size <= 0) {
                    System.out.println("Кількість елементів має бути більшою за 0!");
                    continue;
                }

                return new String[size];
            } catch (Exception e) {
                System.err.println("Помилка! Число не знайдено.\nПовторіть спробу");
                scanner.nextLine();
            }
        }
    }

    public static void fillArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер " + (i + 1) + "\nБудь що: ");
            array[i] = scanner.nextLine();
        }
    }

    public static void searchInArray(String[] array) {
        System.out.println("Що шукаєте?");
        String searchedItem = scanner.nextLine();

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchedItem)) {
                System.out.println("Знайшли! Це " + (i + 1) + " місце");
                isFound = true;
            }
        }


        if (!isFound) {
            System.out.println("Цього елемента тут не існує");
        }
    }
}