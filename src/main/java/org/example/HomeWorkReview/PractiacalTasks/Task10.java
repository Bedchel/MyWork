package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

public class Task10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведить реченя");
        String theSentence = scanner.nextLine();
        String newSentence = theSentence.replace(" ", "_");
        System.out.println("Речення після обробки: " + newSentence);
    }
}
