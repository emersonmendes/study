package br.com.emersonmendes.study.designpattern.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscounterTest {

    @Test
    void shouldGiveDiscount() {

        Discounter discounter = new ChristmasDiscounter();

        assertEquals(discounter.applyDiscount(BigDecimal.valueOf(20)), BigDecimal.valueOf(18.0));

        discounter = new EasterDiscounter();
        assertEquals(discounter.applyDiscount(BigDecimal.valueOf(20)), BigDecimal.valueOf(10.0));

        discounter = (amount) -> amount.multiply(BigDecimal.valueOf(0.2));

        assertEquals(discounter.applyDiscount(BigDecimal.valueOf(20)), BigDecimal.valueOf(4.0));

    }

}