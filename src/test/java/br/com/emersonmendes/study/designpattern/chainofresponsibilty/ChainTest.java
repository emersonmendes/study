package br.com.emersonmendes.study.designpattern.chainofresponsibilty;

import org.junit.jupiter.api.Test;

class ChainTest {

    @Test
    void shouldBeNegativeNumber() {
        Chain chain = new Chain();
        chain.process(Number.of(-1));
        //TODO: do test
    }

    @Test
    void shouldBePositiveNumber() {
        Chain chain = new Chain();
        chain.process(Number.of(+1));
        chain.process(Number.of(+100));
        //TODO: do test
    }

    @Test
    void shouldBeZeroNumber() {
        Chain chain = new Chain();
        chain.process(Number.of(0));
        //TODO: do test
    }

}