package org.example.ReviewPart2;

import java.util.List;

public class TaskNine {
    static void main() {
        try {
            List<Integer> numbers = List.of(13, 2, 1992, 22222222, 22222222);
            List<Integer> numbers2 = numbers.stream().distinct().sorted().toList();
            System.out.println(numbers2.get(numbers2.size() - 2));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Toooo small");
        } catch (NullPointerException exn) {
            System.out.println("null");
        }
    }
}
