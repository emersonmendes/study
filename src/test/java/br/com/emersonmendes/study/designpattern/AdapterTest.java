package br.com.emersonmendes.study.designpattern;

import br.com.emersonmendes.study.designpattern.adapter.Pato;
import br.com.emersonmendes.study.designpattern.adapter.PatoBranco;
import br.com.emersonmendes.study.designpattern.adapter.PeruAdapter;
import br.com.emersonmendes.study.designpattern.adapter.PeruAustraliano;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterTest {

    @Test
    public void shouldTestAdapter()  {

        Pato pato = new PatoBranco();

        Pato peruAdapter = new PeruAdapter( new PeruAustraliano());

        assertThat(pato.grasnar()).isEqualTo("Quack, quack, quack.");
        assertThat(pato.voar()).isEqualTo("Voar, voar, voar, voar, voar");

        assertThat(peruAdapter.grasnar()).isEqualTo("Brulu, brulu, brulu.");
        assertThat(peruAdapter.voar()).isEqualTo("Voar.");


    }

}
