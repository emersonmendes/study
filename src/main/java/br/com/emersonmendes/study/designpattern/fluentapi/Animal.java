package br.com.emersonmendes.study.designpattern.fluentapi;

public class Animal {

    private final String name;

    private final String city;

    private final String occupation;

    private final String race;

    private final String color;

    public Animal(
        String name,
        String city,
        String occupation,
        String race,
        String color
    ) {
        this.name = name;
        this.city = city;
        this.occupation = occupation;
        this.race = race;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getCity() {
        return city;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getRace() {
        return race;
    }

    public static AnimalFluent.AnimalColor name(String name){
        return AnimalFluent.name(name);
    }

}
