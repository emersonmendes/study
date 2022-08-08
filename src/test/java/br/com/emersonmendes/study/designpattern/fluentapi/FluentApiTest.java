package br.com.emersonmendes.study.designpattern.fluentapi;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FluentApiTest {

    @Test
    public void shouldReturnFluentAnimal(){

        Animal animal = Animal
            .name("cachorro")
            .color("black")
            .city("ny")
            .occupation("police")
            .race("German Shepherd");

        Assertions.assertEquals(animal.getName(), "cachorro");
        Assertions.assertEquals(animal.getColor(), "black");
        Assertions.assertEquals(animal.getCity(), "ny");
        Assertions.assertEquals(animal.getOccupation(), "police");
        Assertions.assertEquals(animal.getRace(), "German Shepherd");
    }

    @Test
    public void shouldBuildSubway(){
        Subway subway = Subway
            .size(20)
            .bread("x")
            .meat("xxx")
            .cheese("x")
            .heated(false)
            .salad("xx")
            .sauce("jalapeno")
            .build();
        Assertions.assertEquals(subway.getSauce(), "jalapeno");
    }

}
