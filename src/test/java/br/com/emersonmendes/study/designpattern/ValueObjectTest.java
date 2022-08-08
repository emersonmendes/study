package br.com.emersonmendes.study.designpattern;

import br.com.emersonmendes.study.designpattern.valueobject.Colors;
import br.com.emersonmendes.study.designpattern.valueobject.Currencies;
import org.junit.jupiter.api.Test;

import javax.money.CurrencyUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class ValueObjectTest {

    @Test
    public void shouldTestValueObject()  {

        assertThat(Colors.BLACK.get()).isEqualTo("#000000");
        assertThat(Colors.WHITE.get()).isEqualTo("#FFFFFF");
        assertThat(Currencies.DOLLAR.get().getCurrencyCode()).isEqualTo("USD");

    }

}
