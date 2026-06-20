package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber = 0;
        boolean cycle = true;
        while (cycle)
            try {
                System.out.println("Напишить повноціне число:");
                theNumber = scanner.nextInt();
                cycle = false;
            } catch (Exception e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");
            }
        System.out.println("1. Метод");

        int tempNumber = Math.abs(theNumber);
        int reversedNumber = 0;
        while (tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            tempNumber /= 10;
        }
        if (theNumber < 0) {
            reversedNumber = -reversedNumber;
        }
        System.out.println("Перевернуте число: " + reversedNumber); // Виведе: 4321


        System.out.println("2. Метод");

        String numberAsString = String.valueOf(Math.abs(theNumber));
        String reversedString = new StringBuilder(numberAsString).reverse().toString();
        int reversedNumberSecondMethode = Integer.parseInt(reversedString);
        if (theNumber < 0) {
            reversedNumberSecondMethode = -reversedNumberSecondMethode;
        }
        System.out.println("Перевернуте число: " + reversedNumberSecondMethode); // Виведе: -4321
    }
}
