package org.example.streamAPI.Tasks.TaskTwo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskTwo {
    static void main() {
        List<Worker> workerList = List.of(
                new Worker("Jake", "10", 1890, 17),
                new Worker("Tom", "30", 8890, 39),
                new Worker("Dopen", "20", 2790, 19),
                new Worker("Ent", "10", 2870, 26),
                new Worker("Dem", "20", 3750, 20),
                new Worker("Tom", "30", 10890, 58)
        );

        Map<String, List<Worker>> groupedByDeportament = workerList.stream()
                .collect(Collectors.groupingBy(Worker::deportament));

        System.out.println("--- Співробітники за департаментами ---");
        groupedByDeportament.forEach((deportament, workers) ->
                System.out.println("Департамент " + deportament + ": " + workers));


        System.out.println("\n--- Середня зарплата по департаментах ---");
        Map<String, Double> avgSalaryByDept = workerList.stream()
                .collect(Collectors.groupingBy(
                        Worker::deportament,
                        Collectors.averagingDouble(Worker::salary)
                ));


        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println("Департамент " + dept + ": " + avgSalary));

        System.out.println("\n--- Середня зарплата по департаментах більше 3000 ---");
        avgSalaryByDept.values().stream().filter(s -> s > 3000).forEach(salary ->
                System.out.println("Департамент: " + salary));

    }
}