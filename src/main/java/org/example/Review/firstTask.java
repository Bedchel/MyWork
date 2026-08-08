package org.example.Review;

import java.util.*;

public class firstTask {

    public Map<String, Integer> countWords(List<String> list) {
        Map<String, Integer> result = new HashMap<>();

        for (String word : list) {
            Integer count = result.get(word);
            if (Objects.isNull(count)) {
                result.put(word, 1);
            } else {
                result.put(word, count + 1);
            }
        }

        return result;
    }

    static void main() {
        firstTask task = new firstTask();

        List<String> words = new ArrayList<>();
        words.add("яблуко");
        words.add("банан");
        words.add("яблуко");

        Map<String, Integer> map = task.countWords(words);
        System.out.println(map);
    }
}