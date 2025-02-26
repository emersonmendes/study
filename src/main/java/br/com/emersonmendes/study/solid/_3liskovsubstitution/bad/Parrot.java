package br.com.emersonmendes.study.solid._3liskovsubstitution.bad;

import br.com.emersonmendes.study.solid._3liskovsubstitution.good.Flyable;

public class Parrot extends Bird implements Flyable {

    @Override
    public void fly() {

    }

}