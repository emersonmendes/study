package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.builder.Car;
import br.com.emersonmendes.study.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car getFerrari() {
        return
            new Car.Builder(2020)
                .withColor("red")
                .withName("ferrari")
                .automatic()
                .build();
    }

    public Car getFusca() {
        return
            new Car.Builder(1978)
                .withColor("black")
                .withName("fusca")
                .withOwner(new Person("Emerson Mendes", "O+", 33))
                .build();
    }

}
