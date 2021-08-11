package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.builder.Car;
import br.com.emersonmendes.study.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CarService {

    public Car getFerrari() {
        return
            new Car.Builder()
                .color("red")
                .name("ferrari")
                .year(2020)
                .automatic()
                .build();
    }

    public Car getFusca() {
        return
            new Car.Builder()
                .color("black")
                .name("fusca")
                .year(1978)
                .owner(new Person("Emerson Mendes", "O+", 33))
                .build();
    }

}
