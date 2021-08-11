package br.com.emersonmendes.study.entity;

import br.com.emersonmendes.study.enums.TicketType;

public abstract class Ticket {

    private Person person;

    private String code;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract TicketType getType();

}
