package org.example.streamAPI.Tasks.TaskThree;

import java.util.List;

public class Teacher {
    static int hasBestGrade = 0;

    static void main() {
        List<Student> studentList = List.of(new Student("Minchon", List.of(2, 1, 1)),
                new Student("Student1", List.of(5, 6, 3)),
                new Student("Student2", List.of(2, 3, 1)),
                new Student("Student3", List.of(4, 4, 5)),
                new Student("Student4", List.of(4, 3, 3)));

        for (Student student : studentList) {
            takeBestNotes(student);
        }
        if (hasBestGrade >= studentList.size()) {
            System.out.println("Every one does have one or more of best grade");
        } else {
            System.out.println("Not everyone does have one or more of best grade");
        }

        //Second method
        boolean result = studentList.stream().allMatch(student -> student.grade().stream().anyMatch(grade -> grade == 1));
        if (result) {
            System.out.println("All students have the best grade");
        } else {
            System.out.println("At least one student don't have 1");
        }

        boolean result2 = studentList.stream().allMatch(student -> student.grade().stream().anyMatch(grade -> grade <= 3));
        System.out.println(result2);
    }

    static void takeBestNotes(Student student) {
        for (int grade : student.grade()) {
            if (grade == 1) {
                hasBestGrade += 1;
                break;
            }
        }
    }
}
