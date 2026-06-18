package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши скільки елементів: ");
        String[] array = new String[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер " + (i + 1) + "\nБудь що: ");
            array[i] = scanner.nextLine();
        }
        System.out.println("Що шукаєте?");
        String searchedNumber = scanner.nextLine();
        int notFound = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchedNumber)) {
                System.out.println("Знайшли! Це " + (i + 1) + " місце");
            }else {
                notFound += 1;
            }
        }if (notFound == array.length){
            System.out.println("Цього елемента тут не існує");
        }
    }
}
