package br.com.emersonmendes.study.designpattern.valueobject;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.function.Supplier;

public enum Currencies implements Supplier<CurrencyUnit> {

    EURO("EUR"),
    DOLLAR("USD");

    private final CurrencyUnit currency;

    Currencies(String currencyCode) {
        this.currency = Monetary.getCurrency(currencyCode);
    }

    @Override
    public CurrencyUnit get() {
        return currency;
    }

}
