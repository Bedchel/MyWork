package org.example.ReviewPart2;

import java.util.List;

public class TaskEight {
    static void main() {
        List<Department> departments = List.of(
                new Department("IT", List.of(new Employee("Олег"), new Employee("Анна"))),
                new Department("HR", List.of(new Employee("Богдан"), new Employee("Анна"))),
                new Department("Sales", List.of(new Employee("Вікторія"), new Employee("Олег")))
        );
        System.out.println(departments.stream()
                .flatMap(department -> department.employees().stream())
                .map(Employee::name)
                .distinct()
                .sorted().toList()
        );
    }
}
record Employee(String name) {}
record Department(String name, List<Employee> employees) {}