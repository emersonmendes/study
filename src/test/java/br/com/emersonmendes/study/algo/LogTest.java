package br.com.emersonmendes.study.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LogTest {

    /**
     * Logaritimo de 25 na base 5
     *   Log (25) =  2
     *      5       5  = 25
     *
     * 2 é o Logaritimo de 25 na base 5
     *
     */

    @Test
    void shouldTestLog() {

        int result = Log.log2(8);
        Assertions.assertEquals(result, 3);

        int result2 = Log.logn(8, 2);
        Assertions.assertEquals(result2, 3);

        int resultx = Log.log(8, 8);
        Assertions.assertEquals(resultx, 1);

        int result3 = Log.log(25, 5);
        Assertions.assertEquals(result3, 2);

    }

}