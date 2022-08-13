package br.com.emersonmendes.study.algo;

public class Log {

    /**
     * Logaritimo de 25 na base 5
     *   Log (25) =  2
     *      5       5  = 25
     *
     * 2 é o Logaritimo de 25 na base 5
     *
     */

    static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2) + 1e-10);
    }

    static int log(int x, int b) {
        return (int) (Math.log(x) / Math.log(b) + 1e-10);
    }

    static int logn(int n, int b){
        if(n > (b - 1)) {
            return 1 + logn(n / b, b);
        }
        return 0;
    }


}
