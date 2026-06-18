package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summeOfNumbers = 0;
        System.out.println("До якого числа обчислювати?");
        int lastNumber = scanner.nextInt();
        for (int i = 0; i < lastNumber + 1; i++) {
            summeOfNumbers += i;
        }
        System.out.println(STR."Сумма від одного до \{lastNumber} це \{summeOfNumbers}");
    }
}
