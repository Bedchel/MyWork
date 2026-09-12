package org.example.ReviewPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class TaskSix {
    static void main() {
        List<String> nameList = List.of("Andrei", "Misha", "Minchon", "Ileks", "Halte");

        List<User> userList2 = nameList.stream().map(User::new).toList();
        List<User> userList1 = nameList.stream().map(m -> new User(m)).toList();
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
