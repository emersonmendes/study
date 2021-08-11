package br.com.emersonmendes.study.entity;

import br.com.emersonmendes.study.enums.TicketType;

public class ExecutiveTicket extends Ticket {

    @Override
    public TicketType getType() {
        return TicketType.EXECUTIVE_CLASS;
    }

}
