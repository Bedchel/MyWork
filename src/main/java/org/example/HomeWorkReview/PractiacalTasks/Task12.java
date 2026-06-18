package org.example.HomeWorkReview.PractiacalTasks;

import java.util.ArrayList;

class Task12 {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Мінхон", 612612, 91.5));
        studentsList.add(new Student("Джек", 20, 88.2));
        studentsList.add(new Student("Том", 18, 91.0));

        System.out.println("Список всіх студентів:");
        for (Student s : studentsList) {
            System.out.println(STR."Ім'я: \{s.getName()}, Вік: \{s.getAge()}, Бал: \{s.getScore()}");
        }
        System.out.println(" ");
        Student.findStudentWithBiggestScore(studentsList);
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