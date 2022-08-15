package br.com.emersonmendes.study.other.atomic;

public class Counter extends Thread {

    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        int max = 1_000_00_000;
        for (int i = 0; i < max; i++) {
            increment();
        }
    }

}
