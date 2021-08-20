package br.com.emersonmendes.study.designpattern.adapter;

public class DuckMarreco implements Duck {
    @Override
    public String grasnar(){
        return "Quack, quack, quack.";
    }

    @Override
    public String voar(){
        return "Voar, voar, voar, voar, voar";
    }
}