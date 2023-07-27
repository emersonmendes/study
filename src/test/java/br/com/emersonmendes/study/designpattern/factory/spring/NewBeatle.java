package br.com.emersonmendes.study.designpattern.factory.spring;

import org.springframework.stereotype.Service;

@Service
public class NewBeatle implements ICar {

    @Override
    public CarType getType() {
        return CarType.NEW_BEETLE;
    }

}
