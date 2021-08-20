package br.com.emersonmendes.study.designpattern.adapter;

public class PeruAustraliano implements Peru {

    @Override
    public String soar(){
        return "Brulu, brulu, brulu.";
    }

    @Override
    public String voar(){
        return "Voar.";
    }

}