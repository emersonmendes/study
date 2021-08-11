package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.AbstractTest;
import br.com.emersonmendes.study.builder.Car;
import br.com.emersonmendes.study.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest extends AbstractTest  {

    @Autowired
    public CarService service;

    @Test
    public void shouldGetAFerrari()  {
        Car car = service.getFerrari();
        assertThat(car.getName()).isEqualTo("ferrari");
        assertThat(car.getYear()).isEqualTo(2020);
        assertThat(car.getColor()).isEqualTo("red");
        assertThat(car.getOwner()).isNull();
        assertThat(car.isAutomatic()).isTrue();
    }

    @Test
    public void shouldGetAFusca()  {
        Car car = service.getFusca();
        assertThat(car.getName()).isEqualTo("fusca");
        assertThat(car.getYear()).isEqualTo(1978);
        assertThat(car.getColor()).isEqualTo("black");
        assertThat(car.getOwner()).isNotNull();
        assertThat(car.getOwner().getName()).isEqualTo("Emerson Mendes");
        assertThat(car.isAutomatic()).isFalse();
    }

}
