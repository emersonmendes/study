package br.com.emersonmendes.study.other;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberTest {

    @Test
    public void shouldFindTheSmallestElement(){

        SmallestNumber smallestNumber = new SmallestNumber();

        assertEquals(-1, smallestNumber.find(new int[]{ 0, 1, -1, 3 }));
        assertEquals(-1, smallestNumber.find(new int[]{ -1, 1, 2, 3 }));
        assertEquals(1, smallestNumber.find(new int[]{ 1, 3, 6, 4, 1, 2 }));
        assertEquals(MIN_VALUE, smallestNumber.find(new int[]{ MIN_VALUE, 3, 6, 4 }));

    }

}