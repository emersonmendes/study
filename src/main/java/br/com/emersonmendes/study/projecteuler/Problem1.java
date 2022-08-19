package br.com.emersonmendes.study.projecteuler;

public class Problem1 {

    /**
     * Multiples of 3 or 5 : https://projecteuler.net/problem=1
     */

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if(i % 5 == 0 || i % 3 == 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }

}
