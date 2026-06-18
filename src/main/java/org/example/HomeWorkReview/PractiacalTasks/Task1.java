package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведить будь яке число");
        double number = scanner.nextDouble();
        if (number % 2 == 0) {
            System.out.println("Це число парне");
        } else {
            System.out.println("Це число непарне");
        }
    }
}
