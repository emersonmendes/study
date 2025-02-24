package br.com.emersonmendes.study.solid._3liskovsubstitution.bad;

public class Kiwi extends Bird {
    @Override
    public boolean fly() {
        throw new UnsupportedOperationException("Kiwi does not fly");
    }
}