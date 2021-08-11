package br.com.emersonmendes.study.service;

import br.com.emersonmendes.study.entity.Ticket;
import br.com.emersonmendes.study.enums.TicketType;
import br.com.emersonmendes.study.factory.TicketFactory;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public Ticket getTicket(TicketType type) {
        return TicketFactory.getInstance(type);
    }

}
