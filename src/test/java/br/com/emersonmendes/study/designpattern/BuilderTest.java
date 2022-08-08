package br.com.emersonmendes.study.designpattern;

import br.com.emersonmendes.study.designpattern.builder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void showGetPersonByBuilder() {

        Person person = Person.builder()
            .name("Ben")
            .city("ny")
            .position("dev")
            .build();

        Assertions.assertEquals(person.getName(), "Ben");
        Assertions.assertEquals(person.getPosition().get(), "dev");

    }

}
