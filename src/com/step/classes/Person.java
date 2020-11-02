package com.step.classes;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    String name;
    LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
