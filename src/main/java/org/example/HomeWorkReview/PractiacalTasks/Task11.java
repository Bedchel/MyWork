package org.example.HomeWorkReview.PractiacalTasks;

import java.util.Scanner;

class Task11 {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("--- Зафіксовані ---");
        circle.findingTheBig();
        rectangle.findingTheBig();

        System.out.println("\n--- Інтерактивний режим ---");
        userChoiceMenu();
    }
    public static void userChoiceMenu() {
        while (true) {
            System.out.println("\nОберіть фігуру для обчислення площі:");
            System.out.println("1. Коло");
            System.out.println("2. Прямокутник");
            System.out.println("3. Вихід з програми");
            System.out.print("Ваш вибір: ");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    double r = getPositiveDouble("Введіть радіус кола: ");
                    Circle userCircle = new Circle(r);
                    userCircle.findingTheBig();
                    break;

                case "2":
                    double w = getPositiveDouble("Введіть ширину прямокутника: ");
                    double h = getPositiveDouble("Введіть висоту прямокутника: ");
                    Rectangle userRectangle = new Rectangle(w, h);
                    userRectangle.findingTheBig();
                    break;

                case "3":
                    System.out.println("Дякуємо за використання програми!");
                    return;

                default:
                    System.out.println("Неправильний вибір! Будь ласка, введіть 1, 2 або 3.");
                    break;
            }
        }
    }

    public static double getPositiveDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Параметр має бути більшим за 0!");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.err.println("Помилка! Введіть коректне число.");
                scanner.nextLine();
            }
        }
    }
}

abstract class Shape {
    public abstract void findingTheBig();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void findingTheBig() {
        double area = Math.PI * radius * radius;
        System.out.printf("Площа кола: %.2f\n", area);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void findingTheBig() {
        double area = width * height;
        System.out.printf("Площа прямокутника: %.2f\n", area);
    }
}