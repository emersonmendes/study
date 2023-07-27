package br.com.emersonmendes.study.designpattern.factory.spring;

import br.com.emersonmendes.study.AbstractTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class CarImplFactoryTest extends AbstractTest {

    @Autowired
    private CarImplFactory factory;

    @Test
    public void shouldGetAFerrari()  {

        ICar ferrari = factory.getImpl(CarType.FERRARI);
        assertThat(ferrari).isInstanceOf(Ferrari.class);

        ICar newBeatle = factory.getImpl(CarType.NEW_BEETLE);
        assertThat(newBeatle).isInstanceOf(NewBeatle.class);

        ICar corsa = factory.getImpl(CarType.CORSA);
        assertThat(corsa).isInstanceOf(Corsa.class);

    }

}