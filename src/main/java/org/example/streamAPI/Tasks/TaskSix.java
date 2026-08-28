package org.example.streamAPI.Tasks;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSix {
    static void main() {
        List<String> words = List.of("Java", "Stream", "API", "Collector", "Java", "Reduce", "Map");

        IntSummaryStatistics stats = words.stream()
                .collect(Collectors.summarizingInt(String::length));

        String minWord = words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");

        String maxWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(stats);
        System.out.println("Загальна кількість слів: " + stats.getCount());
        System.out.println("Середня довжина слова: " + stats.getAverage());
        System.out.println("Мінімальне слово за довжиною: " + minWord + " (довжина: " + stats.getMin() + ")");
        System.out.println("Максимальне слово за довжиною: " + maxWord + " (довжина: " + stats.getMax() + ")");

        // Task 2
        List<String> uniqueWords = words.stream()
                .distinct()
                .toList();

        System.out.println(uniqueWords);
    }
}