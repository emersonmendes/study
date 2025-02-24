package br.com.emersonmendes.study.solid._3liskovsubstitution.bad;

public class Parrot extends Bird {

    @Override
    public boolean fly() {
        System.out.println("The parrot is flying");
        return true;
    }

}