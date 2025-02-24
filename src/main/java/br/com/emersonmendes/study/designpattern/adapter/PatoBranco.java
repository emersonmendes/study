package br.com.emersonmendes.study.designpattern.adapter;

public class PatoBranco implements Pato {
    @Override
    public String grasnar(){
        return "Quack, quack, quack.";
    }

    @Override
    public String voar(){
        return "Voar, voar, voar, voar, voar";
    }
}