package br.com.emersonmendes.study.designpattern.strategy;

import java.math.BigDecimal;

public interface Discounter {

    BigDecimal applyDiscount(BigDecimal amount);

}