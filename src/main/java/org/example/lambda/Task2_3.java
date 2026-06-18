package org.example.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class Task2_3 {
    static void main() {

        System.out.println("Task 2");
        Consumer<String> consumer = (str) -> System.out.println(STR."\{str}[SAVED]");
        consumer.accept("LV 19 Chara");

        System.out.println("Task 3");


        Function<User, DTO> function = (user1) -> new DTO(user1.getName(), user1.getEmail());
        User user1 = new User("Frisk", "undertale.Frisk@gmail.com");
        function.apply(user1);
    }

}

class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

record DTO(String name, String email) {

}