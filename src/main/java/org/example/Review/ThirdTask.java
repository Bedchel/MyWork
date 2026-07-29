package org.example.Review;

public class ThirdTask {
    static void main() {
        testMethod();//Нічого
    }
    public static int testMethod() {
        try {
            int x = 10 / 0;
            return 1;
        } catch (ArithmeticException e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
