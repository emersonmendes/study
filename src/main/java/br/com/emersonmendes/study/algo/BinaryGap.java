package br.com.emersonmendes.study.algo;

public class BinaryGap {

    public int countGaps( int number) {

        System.out.println("Number:" + number);
        System.out.println("Bites:" + Integer.toBinaryString(number));

        int maxGap = 0;
        int zeros = 0;
        boolean counting = false;

        while (number != 0) {
            if((number&1) == 1){
                counting = true;
            }
            if(counting){
                if((number&1) == 0){
                    zeros++;
                } else {
                    maxGap = Math.max(maxGap, zeros);
                    zeros = 0;
                }
            }
            number = number >> 1;
        }

        return maxGap;

    }

}
