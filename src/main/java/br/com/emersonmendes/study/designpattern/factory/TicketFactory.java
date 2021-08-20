package br.com.emersonmendes.study.designpattern.factory;

import br.com.emersonmendes.study.entity.EconomicTicket;
import br.com.emersonmendes.study.entity.ExecutiveTicket;
import br.com.emersonmendes.study.entity.FirstTicket;
import br.com.emersonmendes.study.entity.Ticket;
import br.com.emersonmendes.study.enums.TicketType;

public class TicketFactory {

    public static Ticket getInstance(TicketType type) {
        switch (type) {
            case ECONOMIC_CLASS:
                return new EconomicTicket();
            case EXECUTIVE_CLASS:
                return new ExecutiveTicket();
            case FIRST_CLASS:
                return new FirstTicket();
        }
        return null;
    }

}
