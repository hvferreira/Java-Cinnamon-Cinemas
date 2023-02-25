package org.example;

import java.util.ArrayList;

public class Customer {


    private ArrayList<Ticket> ticketList;

    public Customer() {
        this.ticketList = new ArrayList<>();
    }


    public void setTicketList(Ticket ticket) {
        ticketList.add(ticket);
    }

    public int sizeTicketList() {
        return ticketList.size();
    }
}
