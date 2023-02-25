package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinnamonTest {


    @Test
    void Customer() {
        Cinnamon cinnamon = new Cinnamon();//create customer and TheatreRoom
        Customer customer = cinnamon.getCustomer();
        assertEquals(0, customer.sizeTicketList());
        customer.setTicketList(new Ticket(new Movie(), new TheatreRoom(), new Seat("A", "1")));
        assertEquals(1, customer.sizeTicketList());

    }

    @Test
    void cinema() {
        Cinnamon cinnamon = new Cinnamon();//create customer and TheatreRoom
        Customer customer = cinnamon.getCustomer();
        TheatreRoom theatreRoom = cinnamon.getTheatreRoom();

    }
}