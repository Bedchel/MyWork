package org.example.Optinal;

import java.util.Optional;

public class FirstTask {
    static FirstTask task = new FirstTask();

    static void main() {
        String name = null;
        System.out.println("Task 1");
        System.out.println(task.greetUser(name));

        String input = "99";
        System.out.println("Task 2");
        System.out.println(task.parseDiscount(input));

    }

    public String greetUser(String name) {
        return "Привіт: " + Optional.ofNullable(name).filter(s -> !s.trim().isEmpty()).map(String::toUpperCase).orElse("Гість");
    }

    public Optional<Integer> parseDiscount(String input) {
        return Optional.ofNullable(input)
                .flatMap(s -> {
                    try {
                        return Optional.of(Integer.parseInt(s.trim()));
                    } catch (NumberFormatException e) {
                        return Optional.empty();
                    }
                })
                .filter(d -> d >= 5 && d <= 50);
    }
}
