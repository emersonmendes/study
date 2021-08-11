package br.com.emersonmendes.study.entity;

import br.com.emersonmendes.study.enums.TicketType;

public class FirstTicket extends Ticket {

    @Override
    public TicketType getType() {
        return TicketType.FIRST_CLASS;
    }

}
