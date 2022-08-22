package br.com.emersonmendes.study.other.comparate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PersonTest {

    @Test
    void shouldSortPersonListByComparator() {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(20, "Jonh"));
        personList.add(new Person(30, "Mary"));
        personList.add(new Person(16, "Mark"));

        personList.sort(new AgeComparator());

        Assertions.assertEquals(personList.get(0).getName(), "Mark");
        Assertions.assertEquals(personList.get(1).getName(), "Jonh");
        Assertions.assertEquals(personList.get(2).getName(), "Mary");

    }

    @Test
    void shouldSortPersonListByComparable() {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(20, "Jonh"));
        personList.add(new Person(30, "Mary"));
        personList.add(new Person(16, "Mark"));
        personList.sort(Person::compareTo);

        //Collections.sort(personList);

        Assertions.assertEquals(personList.get(0).getName(), "Mark");
        Assertions.assertEquals(personList.get(1).getName(), "Jonh");
        Assertions.assertEquals(personList.get(2).getName(), "Mary");


    }

}