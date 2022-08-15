package br.com.emersonmendes.study.other.atomic;

class SynchronizedCounter extends Thread {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized int getValue() {
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