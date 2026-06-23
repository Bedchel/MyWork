package org.example.HomeWorkReview.PractiacalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = 0;
        int summeOfNumbers = 0;
        while (true)
            try {
                System.out.println("До якого числа обчислювати?");
                lastNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");
            }
        for (int i = 0; i < lastNumber + 1; i++) {
            summeOfNumbers += i;
        }
        System.out.println(STR."Сумма від одного до \{lastNumber} це \{summeOfNumbers}");
    }
}
