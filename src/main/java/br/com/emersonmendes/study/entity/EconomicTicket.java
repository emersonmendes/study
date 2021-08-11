package br.com.emersonmendes.study.entity;

import br.com.emersonmendes.study.enums.TicketType;

public class EconomicTicket extends Ticket {

    @Override
    public TicketType getType() {
        return TicketType.ECONOMIC_CLASS;
    }

}
