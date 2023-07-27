package br.com.emersonmendes.study.designpattern.factory;

import br.com.emersonmendes.study.entity.EconomicTicket;
import br.com.emersonmendes.study.entity.ExecutiveTicket;
import br.com.emersonmendes.study.entity.FirstTicket;
import br.com.emersonmendes.study.entity.Ticket;
import br.com.emersonmendes.study.enums.TicketType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketFactory {

    private static final Map<TicketType, Supplier<Ticket>> ticketMap = new HashMap<>();

    static {
        ticketMap.put(TicketType.ECONOMIC_CLASS, EconomicTicket::new);
        ticketMap.put(TicketType.EXECUTIVE_CLASS, ExecutiveTicket::new);
        ticketMap.put(TicketType.FIRST_CLASS, FirstTicket::new);
    }

    public static Ticket getInstance(TicketType type) {
        Supplier<Ticket> ticketSupplier = ticketMap.get(type);
        if(ticketSupplier == null){
            throw new IllegalArgumentException("Type not found!");
        }
        return ticketSupplier.get();
    }

}
