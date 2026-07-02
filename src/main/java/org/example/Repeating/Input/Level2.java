package org.example.Repeating.Input;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Level2 {
    Scanner scanner = new Scanner(System.in);
    static Level2 level2 = new Level2();
    static void main() {
        String[] inputs = new String[level2.checkInput()];
        level2.fullTheArray(inputs);
        System.out.println(Arrays.toString(inputs));
    }

    public int checkInput() {
        while (true) {
            try {
                System.out.println("How many String?");
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input <= 0) {
                    System.out.println("It must be over 0");
                    continue;
                }
                return input;
            } catch (InputMismatchException ime) {
                System.out.println("Please full numbers and not double");
                level2.scanner.nextLine();
            } finally {
                scanner.nextLine();
            }
        }
    }

    public void fullTheArray(String[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("White anything for " + (i + 1) + " slot.");
            inputs[i] = scanner.nextLine();
        }
    }
}