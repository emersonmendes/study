package br.com.emersonmendes.study.algo;

import br.com.emersonmendes.study.entity.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareTest {

    @Test
    void shouldSortPerson() {

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("Emerson");

        Person p2 = new Person();
        p2.setName("Bernardo");

        Person p3 = new Person();
        p3.setName("Fernanda");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

//        personList.sort(Comparator.comparing(Person::getName));
        System.out.println("Before Sorting : " + personList);


    }

}