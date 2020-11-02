package com.step;

import com.step.classes.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> Persons = new ArrayList<Person>(5);

        Persons.add(new Person("Andrei", LocalDate.parse("2000-10-23")));
        Persons.add(new Person("Ion", LocalDate.parse("1999-06-11")));
        Persons.add(new Person("Vasea", LocalDate.parse("2001-02-27")));
        Persons.add(new Person("Sandu", LocalDate.parse("2000-09-04")));
        Persons.add(new Person("Adrian", LocalDate.parse("2002-04-01")));

        Collections.sort(Persons);

        for(Person p: Persons) {
            System.out.println(p.getName());
        }
    }
}
