package org.example.colections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListOfTenMoves {
    public static void main(String[] args) {
        StringBuilder stringBuilder;
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<StringBuilder> arrayDeque = new ArrayDeque<>();
        while (true) {
            for (int i = 0; i < 15; i++) {
                if (!arrayDeque.isEmpty()) {
                    System.out.println("Do you want to delete last action?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int answer = scanner.nextInt();
                    if (answer == 1) {
                        arrayDeque.removeLast();//Win + V
                    }
                    scanner.nextLine();
                }

                System.out.println("\nWrite something:");

                stringBuilder = new StringBuilder();
                stringBuilder.append(scanner.nextLine());
                arrayDeque.add(stringBuilder);

                if (arrayDeque.size() == 11) {
                    arrayDeque.removeFirst();
                }
            }
            for (StringBuilder j : arrayDeque) {
                System.out.println(j.toString());
            }


        }

    }
}
