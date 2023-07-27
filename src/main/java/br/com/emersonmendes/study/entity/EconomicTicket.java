package br.com.emersonmendes.study.entity;

import br.com.emersonmendes.study.enums.TicketType;

public class EconomicTicket extends Ticket {

    public EconomicTicket() {
        System.out.println("x");
    }

    @Override
    public TicketType getType() {
        return TicketType.ECONOMIC_CLASS;
    }

}
