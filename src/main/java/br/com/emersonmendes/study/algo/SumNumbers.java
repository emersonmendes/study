package br.com.emersonmendes.study.algo;

import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {
        var ar = List.of(1,2,3,4,5);
        System.out.println(ar.stream().reduce(0, Integer::sum));
        int sum = ar.stream().mapToInt(Integer::intValue).sum();
    }
}
