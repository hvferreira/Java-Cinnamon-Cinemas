package org.example;

import java.util.ArrayList;

public class Customer {


    private ArrayList<Ticket> ticketList;

    public Customer() {
    }


    public void setTicketList(Ticket ticket) {
        ticketList.add(ticket);
    }
}
