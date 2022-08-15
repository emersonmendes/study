package br.com.emersonmendes.study.other.atomic;

public class VolatilCounter extends Thread {

    private volatile int c = 0;

    public void increment() {
        c++;
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
