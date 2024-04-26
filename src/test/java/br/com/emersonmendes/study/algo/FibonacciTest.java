package br.com.emersonmendes.study.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void shouldCalcFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.calc(0));
        assertEquals(5, fibonacci.calc(5));
        assertEquals(1, fibonacci.calc(1));
        assertEquals(2, fibonacci.calc(3));
        assertEquals(34, fibonacci.calc(9));
        assertEquals(610, fibonacci.calc(15));
    }

}