package org.example.MathHelp;

public class HomeWork1_3 {
    static void main() {
        int x = 0;
        int commands = 0;
        do {
            x += 17;
            commands += 1;
        } while (x % 365 != 0);
        System.out.println(x);
        System.out.println(commands);
    }
}
