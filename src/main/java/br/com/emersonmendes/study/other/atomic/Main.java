package br.com.emersonmendes.study.other.atomic;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Counter counter = new Counter();
//        AtomicCounter counter = new AtomicCounter();
//        SynchronizedCounter counter = new SynchronizedCounter();
        VolatilCounter counter = new VolatilCounter();

        Thread thread1 = new Thread(counter,"t1");
        Thread thread2 = new Thread(counter,"t2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());

    }

}
