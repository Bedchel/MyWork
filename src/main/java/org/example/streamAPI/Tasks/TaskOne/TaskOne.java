package org.example.streamAPI.Tasks.TaskOne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskOne {
    static void main() {
        List<Person> people = List.of(new Person("Name", "SecondName", 17),
                new Person("Name2", "SecondName2", 97),
                new Person("Name3", "SecondName3", 24),
                new Person("Name4", "SecondName4", 52),
                new Person("Name5", "SecondName5", 62),
                new Person("Name6", "SecondName6", 73),
                new Person("Name7", "SecondName7", 10),
                new Person("Minchon", "GoCH", 9));

        int betterPlaces = 2;
        int normalPlaces = 3;
        int timeThatIsTooLate = 60;
        System.out.println("Task one");
        people.stream().sorted(Comparator.comparingInt(Person::time)).sorted(Comparator.comparing(Person::name)).forEach(System.out::println);
        System.out.println("Task two");
        List<Person> peopleThatAreOk = people.stream().filter(l -> l.time() <= timeThatIsTooLate).sorted(Comparator.comparing(Person::name)).toList();
        peopleThatAreOk.forEach(System.out::println);
        System.out.println("Task three");
        peopleThatAreOk.stream().sorted(Comparator.comparing(Person::name)).limit(betterPlaces).forEach(System.out::println);
        System.out.println("Task four");
        peopleThatAreOk.stream().sorted(Comparator.comparing(Person::name)).skip(betterPlaces).limit(normalPlaces).forEach(System.out::println);
    }
}
