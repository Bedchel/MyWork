package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber = 0;
        int amountOfZiffersInNumber = 0;
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
        System.out.println("1.Метод з циклом");
        int theNumberForFirstMethod = theNumber;
        if (theNumberForFirstMethod == 0) {
            System.out.println(STR."Кількість цифр у числі: 1");
        } else {
            while (Math.abs(theNumberForFirstMethod) >= 1) {
                theNumberForFirstMethod /= 10;
                amountOfZiffersInNumber += 1;
            }
        }
        System.out.println(STR."Кількість цифр у числі: \{amountOfZiffersInNumber}");
        int theNumberForSecondMethod = theNumber;

        System.out.println("2.Метод з пертворенням у стрінг");
        String numberAsString = String.valueOf(Math.abs(theNumberForSecondMethod));
        amountOfZiffersInNumber = numberAsString.length();
        System.out.println(STR."Кількість цифр у числі: \{amountOfZiffersInNumber}");

    }
}
