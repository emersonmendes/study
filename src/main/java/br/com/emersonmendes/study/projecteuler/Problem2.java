package br.com.emersonmendes.study.projecteuler;

import java.util.Map;

public class Problem2 {

    /**
     * 	Even Fibonacci numbers : https://projecteuler.net/problem=2
     */

    public static void main(String[] args) {


        int sum = 0;
        int previous = 1;
        int current = 1;

        //4613732

       while (current < 4000000){
           if(current % 2 == 0){
               sum += current;
           }
           int h = previous + current;
           previous = current;
           current = h;

       }

       System.out.println("Sum: " + sum);

    }

}
