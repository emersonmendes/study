package br.com.emersonmendes.study.designpattern.builder;

import java.util.Objects;

public class PersonBuilder {

    private String name;
    private String city;
    private String position;

    PersonBuilder(){

    }

    public PersonBuilder name(String name) {
        this.name = Objects.requireNonNull(name);
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = Objects.requireNonNull(city);
        return this;
    }

    public PersonBuilder position(String position) {
        this.position = Objects.requireNonNull(position);
        return this;
    }

    public Person build() {
        Objects.requireNonNull(name,"Name cannot be null");
        Objects.requireNonNull(city,"City cannot be null");
        return new Person(name, city, position);
    }

}