package br.com.emersonmendes.study.designpattern;

import br.com.emersonmendes.study.designpattern.strategy.Cook;
import br.com.emersonmendes.study.designpattern.strategy.Cooks;
import org.junit.Assert;
import org.junit.Test;


public class StrategyTest {

    @Test
    public void shouldReturnADish(){

        Cook cook1 = Cooks.BRAZILAN;
        Assert.assertEquals(cook1.prepare(), "Feijoada!");

        Cook cook2 = Cooks.ITALIAN;
        Assert.assertEquals(cook2.prepare(), "Pizza!");

    }

}
