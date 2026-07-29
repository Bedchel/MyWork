package org.example.Review.secondTask;

import java.util.HashMap;
import java.util.Map;

public class Consol {
    static void main() {
        Map<Person, Integer> map = new HashMap<>();
        Person person = new Person("First", 612612);
        map.put(person, 612);
        person.setName("Changed");
        System.out.println(map.get(person));
    }
}
