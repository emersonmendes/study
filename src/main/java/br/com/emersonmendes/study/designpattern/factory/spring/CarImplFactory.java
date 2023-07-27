package br.com.emersonmendes.study.designpattern.factory.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CarImplFactory {

    private final Map<CarType, ICar> carsMap;

    @Autowired
    private CarImplFactory(List<ICar> cars) {
        carsMap = cars
            .stream()
            .collect(Collectors.toMap(ICar::getType, Function.identity()));
    }

    public ICar getImpl(CarType type){
        ICar car = carsMap.get(type);
        if(car == null){
            throw new IllegalArgumentException("Type was not found: " + type);
        }
        return car;
    }

}
