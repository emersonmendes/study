package br.com.emersonmendes.study.solid._4interfacesegregation.bad;

public class Robot implements Worker {

    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

}