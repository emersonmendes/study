package br.com.emersonmendes.study.designpattern;

import br.com.emersonmendes.study.designpattern.adapter.Duck;
import br.com.emersonmendes.study.designpattern.adapter.DuckMarreco;
import br.com.emersonmendes.study.designpattern.adapter.PeruAdapter;
import br.com.emersonmendes.study.designpattern.adapter.PeruAustraliano;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {

    @Test
    public void shouldTestAdapter()  {

        Duck duck = new DuckMarreco();

        Duck peruAdapter = new PeruAdapter( new PeruAustraliano());

        assertThat(duck.grasnar()).isEqualTo("Quack, quack, quack.");
        assertThat(duck.voar()).isEqualTo("Voar, voar, voar, voar, voar");

        assertThat(peruAdapter.grasnar()).isEqualTo("Brulu, brulu, brulu.");
        assertThat(peruAdapter.voar()).isEqualTo("Voar.");


    }

}
