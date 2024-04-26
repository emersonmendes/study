package br.com.emersonmendes.study.algo;

public class Fibonacci {

    public int calc(int number) {

        if(number <= 1){
            return number;
        }

        int current = 0;
        int next = 1;
        int sum = 1;

        for (int i = 0; i < (number - 1); i++) {
            sum = current + next;
            current = next;
            next = sum;
        }

        return sum;

    }

}
