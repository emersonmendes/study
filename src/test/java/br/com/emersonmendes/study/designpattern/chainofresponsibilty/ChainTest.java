package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ChainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void shouldBeNegativeNumber() {
        Chain chain = new Chain();
        chain.process(Number.of(-1));

        String output = """
        NegativeProcessor : -1
        """;

        Assertions.assertEquals(output, outputStreamCaptor.toString());

    }

    @Test
    void shouldBePositiveNumber() {

        Chain chain = new Chain();
        chain.process(Number.of(-100));
        chain.process(Number.of(0));
        chain.process(Number.of(+1));
        chain.process(Number.of(+100));
        chain.process(Number.of(28));

        String output = """
        NegativeProcessor : -100
        ZeroProcessor : 0
        PositiveProcessor : 1
        PositiveProcessor : 100
        Esse é a data do Bê!
        """;

        Assertions.assertEquals(output, outputStreamCaptor.toString());

    }

    @Test
    void shouldBeZeroNumber() {

        Chain chain = new Chain();
        chain.process(Number.of(0));

        String output = """
        ZeroProcessor : 0
        """;

        Assertions.assertEquals(output, outputStreamCaptor.toString());

    }

}