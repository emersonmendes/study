package br.com.emersonmendes.study.other.bitwise;

public class BitWise {

    public static void main(String[] args) {

        /**
            a = 5 = 0101 (In Binary)
            b = 7 = 0111 (In Binary)

            Bitwise OR Operation of 5 and 7
              0101
            | 0111
             ________
              0111  = 7 (In decimal)
         */

        // Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 1's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);

    }

}
