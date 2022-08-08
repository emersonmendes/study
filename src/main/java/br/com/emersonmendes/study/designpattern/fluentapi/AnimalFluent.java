package br.com.emersonmendes.study.designpattern.fluentapi;

import java.util.Objects;

public class AnimalFluent {

    static AnimalColor name(String name){
        Objects.requireNonNull(name,"Name is required!");
        return new AnimalDSL(name);
    }

    interface AnimalColor {
        AnimalCity color(String color);
    }

    interface AnimalCity {
        AnimalOccupation city(String city);
    }

    interface AnimalOccupation {
        AnimalBuild occupation(String occupation);
    }

    interface AnimalBuild {
        Animal build();
        Animal race(String race);
    }

}
