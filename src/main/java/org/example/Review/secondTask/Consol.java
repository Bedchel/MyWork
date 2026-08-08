package org.example.Review.secondTask;

import java.util.HashMap;
import java.util.Map;

public class Consol {
    static void main() {
        Map<Person, Integer> map = new HashMap<>();
        Person person = new Person("First", 612612);
        map.put(person, 612);
        Person person2 = new Person("Changed", 612612);
        map.put(person2, 126);
        person.setName("Changed");
        System.out.println(map.get(person));
        System.out.println(map.get(person2));
        System.out.println(map);

    }
}
