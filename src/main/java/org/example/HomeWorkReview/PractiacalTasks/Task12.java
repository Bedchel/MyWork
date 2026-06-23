package org.example.HomeWorkReview.PractiacalTasks;

import java.util.ArrayList;
import java.util.Scanner;

class Task12 {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        ArrayList<Student> studentsListDeffault = new ArrayList<>();
        studentsListDeffault.add(new Student("Мінхон", 612612, 91.5));
        studentsListDeffault.add(new Student("Джек", 20, 88.2));
        studentsListDeffault.add(new Student("Том", 18, 91.0));

        System.out.println("--- Зафіксовані студенти ---");
        printStudents(studentsListDeffault);
        System.out.println(" ");
        Student.findStudentWithBiggestScore(studentsListDeffault);

        ArrayList<Student> studentsList = new ArrayList<>();
        userMenu(studentsList);
    }

    public static void printStudents(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("Список порожній.");
            return;
        }
        for (Student s : list) {
            System.out.println(STR."Ім'я: \{s.getName()}, Вік: \{s.getAge()}, Бал: \{s.getScore()}");
        }
    }

    public static void userMenu(ArrayList<Student> list) {
        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Додати нового студента");
            System.out.println("2. Показати всіх студентів");
            System.out.println("3. Знайти студента з найбільшим балом");
            System.out.println("4. Вихід");
            System.out.print("Ваш вибір: ");

            String choice = scanner.next();
            scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Введіть ім'я: ");
                    String name = scanner.nextLine();

                    int age = getPositiveInt("Введіть вік: ");
                    double score = getPositiveDouble("Введіть бал: ");

                    list.add(new Student(name, age, score));
                    System.out.println("Студента успішно додано!");
                    break;

                case "2":
                    System.out.println("\nСписок всіх студентів:");
                    printStudents(list);
                    break;

                case "3":
                    System.out.println(" ");
                    Student.findStudentWithBiggestScore(list);
                    break;

                case "4":
                    System.out.println("Дякуємо за використання програми!");
                    return;

                default:
                    System.out.println("Неправильний вибір! Введіть 1, 2, 3 або 4.");
                    break;
            }
        }
    }

    public static int getPositiveInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = scanner.nextInt();
                if (value <= 0) {
                    System.out.println("Вік має бути більшим за 0!");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.err.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
            }
        }
    }

    public static double getPositiveDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = scanner.nextDouble();
                if (value < 0 || value > 100) {
                    System.out.println("Бал має бути в межах від 0 до 100!");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.err.println("Помилка! Введіть число (наприклад, 92,5).");
                scanner.nextLine();
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private double score;

    public static void findStudentWithBiggestScore(ArrayList<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("Список студентів порожній.");
            return;
        }

        Student studentWithWithBiggestScore = students.get(0);

        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getScore() > studentWithWithBiggestScore.getScore()) {
                studentWithWithBiggestScore = students.get(i);
            }
        }
        System.out.println(STR."Студент з найбільшим балом: \{studentWithWithBiggestScore.getName()} (\{studentWithWithBiggestScore.getScore()})");
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}