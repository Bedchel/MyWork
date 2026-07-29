package org.example.Review.secondTask;

public class Person {
    String name;
    long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
