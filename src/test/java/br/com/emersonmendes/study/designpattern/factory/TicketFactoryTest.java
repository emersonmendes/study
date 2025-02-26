package br.com.emersonmendes.study.designpattern.factory;

import br.com.emersonmendes.study.entity.EconomicTicket;
import br.com.emersonmendes.study.entity.ExecutiveTicket;
import br.com.emersonmendes.study.entity.FirstTicket;
import br.com.emersonmendes.study.entity.Ticket;
import br.com.emersonmendes.study.enums.TicketType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicketFactoryTest {


    @Test
    void shouldTest() {

        Ticket economicTicket = TicketFactory.getInstance(TicketType.ECONOMIC_CLASS);
        assertThat(economicTicket).isInstanceOf(EconomicTicket.class);

        Ticket economicTicket2 = TicketFactory.getInstance(TicketType.ECONOMIC_CLASS);
        assertThat(economicTicket2).isInstanceOf(EconomicTicket.class);

        Ticket executiveTicket = TicketFactory.getInstance(TicketType.EXECUTIVE_CLASS);
        assertThat(executiveTicket).isInstanceOf(ExecutiveTicket.class);

        Ticket firstClassTicket = TicketFactory.getInstance(TicketType.FIRST_CLASS);
        assertThat(firstClassTicket).isInstanceOf(FirstTicket.class);

    }

}