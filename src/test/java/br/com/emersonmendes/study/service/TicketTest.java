package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.AbstractTest;
import br.com.emersonmendes.study.entity.Ticket;
import br.com.emersonmendes.study.enums.TicketType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class TicketTest extends AbstractTest {

    @Autowired
    public TicketService service;

    @Test
    public void shouldReturnTickets(){

        Ticket ticket1 = service.getTicket(TicketType.ECONOMIC_CLASS);
        Ticket ticket2 = service.getTicket(TicketType.EXECUTIVE_CLASS);
        Ticket ticket3 = service.getTicket(TicketType.FIRST_CLASS);

        assertThat(ticket1.getType()).isEqualByComparingTo(TicketType.ECONOMIC_CLASS);
        assertThat(ticket2.getType()).isEqualByComparingTo(TicketType.EXECUTIVE_CLASS);
        assertThat(ticket3.getType()).isEqualByComparingTo(TicketType.FIRST_CLASS);

    }

}
