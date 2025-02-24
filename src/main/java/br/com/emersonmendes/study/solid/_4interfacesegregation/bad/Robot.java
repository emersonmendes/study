package br.com.emersonmendes.study.solid._4interfacesegregation.bad;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }
}