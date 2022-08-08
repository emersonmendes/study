package br.com.emersonmendes.study.designpattern.fluentapi;

import java.util.Objects;

public class AnimalDSL implements
    AnimalFluent.AnimalColor,
    AnimalFluent.AnimalCity,
    AnimalFluent.AnimalOccupation,
    AnimalFluent.AnimalBuild
{

    private final String name;

    private String city;

    private String occupation;

    private String race;

    private String color;

    public AnimalDSL(String name) {
        this.name = name;
    }

    @Override
    public AnimalFluent.AnimalCity color(String color) {
        Objects.requireNonNull(color, "Color is required!");
        this.color = color;
        return this;
    }

    @Override
    public AnimalFluent.AnimalOccupation city(String city) {
        Objects.requireNonNull(city, "Local is required!");
        this.city = city;
        return this;
    }

    @Override
    public AnimalFluent.AnimalBuild occupation(String occupation) {
        Objects.requireNonNull(occupation, "Occupation is required!");
        this.occupation = occupation;
        return this;
    }

    @Override
    public Animal race(String race) {
        Objects.requireNonNull(race, "Race is required!");
        this.race = race;
        return build();
    }

    @Override
    public Animal build() {
        return new Animal(this.name, this.city, this.occupation, this.race, this.color);
    }

}
