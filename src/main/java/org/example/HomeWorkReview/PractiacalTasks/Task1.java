package org.example.HomeWorkReview.PractiacalTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ведить будь яке число");
            try {
                double number = scanner.nextDouble();
                if (number % 2 == 0) {
                    System.out.println("Це число парне");
                } else {
                    System.out.println("Це число непарне");
                }
                break;
            } catch (InputMismatchException e) {
                System.err.println("Помилка число незнайдено\n" +
                        "Повторить спробу");
            }
        }
    }
}
