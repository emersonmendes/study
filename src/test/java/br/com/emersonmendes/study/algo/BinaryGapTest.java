package br.com.emersonmendes.study.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    void shouldCountNinaryGaps() {
        BinaryGap binaryGap = new BinaryGap();

        Assertions.assertEquals( 0, binaryGap.countGaps(0));
        Assertions.assertEquals( 0, binaryGap.countGaps(1));
        Assertions.assertEquals( 0, binaryGap.countGaps(2));
        Assertions.assertEquals( 0, binaryGap.countGaps(4));
        Assertions.assertEquals( 0, binaryGap.countGaps(8));
        Assertions.assertEquals( 0, binaryGap.countGaps(256));

        Assertions.assertEquals( 2, binaryGap.countGaps(9));
        Assertions.assertEquals( 2, binaryGap.countGaps(19));
        Assertions.assertEquals( 2, binaryGap.countGaps(39));
        Assertions.assertEquals( 3, binaryGap.countGaps(272));
        Assertions.assertEquals( 5, binaryGap.countGaps(261));
        Assertions.assertEquals( 6, binaryGap.countGaps(129));
        Assertions.assertEquals( 7, binaryGap.countGaps(594177));
        Assertions.assertEquals( 0, binaryGap.countGaps(1024));
        Assertions.assertEquals( 0, binaryGap.countGaps(1073741824));
    }

}