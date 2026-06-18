package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишить повноціне число:");
        int theNumber = scanner.nextInt();
        int amountOfZiffersInNumber = 0;
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
