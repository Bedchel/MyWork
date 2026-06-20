package org.example.HomeWorkReview;

public class FromOneTypeInAnother {
    static void main() {
        double x = 40.0;
        int y = (int) x;
        System.out.println(y);

        char letter = 'A';
        int number = letter;
        System.out.println(letter);
        System.out.println(number);

        short o = 2;
        int i = o;
    }
}
