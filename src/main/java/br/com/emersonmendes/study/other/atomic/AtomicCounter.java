package br.com.emersonmendes.study.other.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter extends Thread {

    private final AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }

    public void increment() {
        counter.incrementAndGet();
    }

    @Override
    public void run() {
        int max = 1_000_00_000;
        for (int i = 0; i < max; i++) {
            increment();
        }
    }

}
