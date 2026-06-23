package org.example.HomeWorkReview.PractiacalTasks;

public class Task5 {
    static void main(String[] args) {
        for (int j = 1; j < 11; j++) {
            for (int i = 1; i < 11; i++) {// Мені просто захотілось щоб воно було рівно тому я загуглив та це означає що кожне число буде займати 4 відступа
                System.out.printf("%-4d", i * j );
            }
            System.out.println();
        }
    }
}
