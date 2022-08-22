package br.com.emersonmendes.study.designpattern.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    void shouldDoSomething() {

        PersonService service1 = PersonService.getInstance();
        PersonService service2 = PersonService.getInstance();

        Assertions.assertEquals(service1, service2);

        Assertions.assertEquals(service1.doSomething(), "Something!");
        Assertions.assertEquals(service2.doSomething(), "Something!");
    }

}