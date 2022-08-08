package br.com.emersonmendes.study.designpattern.builder;

import java.util.Optional;

public class Person {

    private String name;

    private String city;

    private String position;

    private Person() {
    }

    Person(String name, String city, String position) {
        this.name = name;
        this.city = city;
        this.position = position;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

}
