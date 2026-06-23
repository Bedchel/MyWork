package org.example.HomeWorkReview.PractiacalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber = 0;
        while (true)
            try {
                System.out.println("Напишить повноціне число:");
                theNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");
            }
        System.out.println("1. Метод");

        System.out.println("1. Метод (Математичний):");
        int result1 = reverseMath(theNumber);
        System.out.println("Перевернуте число: " + result1);

        System.out.println("2. Метод (StringBuilder):");
        int result2 = reverseString(theNumber);
        System.out.println("Перевернуте число: " + result2);
    }

    public static int reverseMath(int number) {
        int tempNumber = Math.abs(number);
        int reversedNumber = 0;

        while (tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            tempNumber /= 10;
        }

        if (number < 0) {
            reversedNumber = -reversedNumber;
        }

        return reversedNumber;
    }

    public static int reverseString(int number) {
        String numberAsString = String.valueOf(Math.abs(number));
        String reversedString = new StringBuilder(numberAsString).reverse().toString();
        int reversedNumberSecondMethod = Integer.parseInt(reversedString);

        if (number < 0) {
            reversedNumberSecondMethod = -reversedNumberSecondMethod;
        }

        return reversedNumberSecondMethod;
    }
}
