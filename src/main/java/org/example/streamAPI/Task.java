package org.example.streamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    static void main() {
        System.out.println("Task one");
        List<Integer> list = List.of(2, 5, 7, 9, 6, -5, -8, 0);
        List<Integer> list2 = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                list2.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list2);

        System.out.println("Task two");
        List<String> sentence = List.of("ed", "9", "fo");
        List<Integer> number = new ArrayList<>();
        for (String string : sentence) {
            number.add(string.length());
        }
        System.out.println(number);

        System.out.println("Task three");
        List<String> nameList = List.of("Ich", "Minchon", "I", "Ich", "Ich", "Alexey", "Alexey", "i");

        Set<String> correctedList = new HashSet<>(nameList);
        System.out.println(correctedList);

        System.out.println("Stream Api");

        System.out.println("Task one");
        List<Integer> listApi = List.of(2, 5, 7, 9, 6, -5, -8, 0);
        List<Integer> list2Api = listApi.stream().filter(s -> s % 2 == 0).toList();

        System.out.println(listApi);
        System.out.println(list2Api);

        System.out.println("Task two");
        List<String> sentenceApi = List.of("ed", "9", "fo");

        List<Integer> numberApi = new ArrayList<>();
        sentenceApi.stream().forEach(s -> numberApi.add(s.length()));
        System.out.println(numberApi);

        System.out.println("Task three");
        List<String> nameListApi = List.of("Ich", "Minchon", "I", "Ich", "Ich", "Alexey", "Alexey", "i");

        List<String> correctedListApi = List.of(nameListApi.stream().distinct().toString());
        correctedListApi.forEach(System.out::println);
    }
}
