package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишить повноціне число:");
        int theNumber = scanner.nextInt();

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
