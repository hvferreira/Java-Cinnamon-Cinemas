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
        TheatreRoom theatreRoom = cinnamon.getTheatreRoom();//create movie and hashSeats

    }

    @Test
    void randomTest() {
        Cinnamon cinnamon = new Cinnamon();
        int numRandom = cinnamon.random();
        assertTrue(1 <= numRandom && numRandom <= 3);
    }

    @Test
    void createSeatTest() {
        Cinnamon cinnamon = new Cinnamon();//create customer and TheatreRoom
        Customer customer = cinnamon.getCustomer();
        TheatreRoom theatreRoom = cinnamon.getTheatreRoom();//create movie

        Seat seat = theatreRoom.createSeat();
        assertEquals("A", seat.getRow());
        assertEquals("1", seat.getSeatNumb());

        Seat seat1 = theatreRoom.createSeat();
        assertEquals("A", seat1.getRow());
        assertEquals("2", seat1.getSeatNumb());

        Seat seat2 = theatreRoom.createSeat();
        assertEquals("A", seat2.getRow());
        assertEquals("3", seat2.getSeatNumb());

        Seat seat3 = theatreRoom.createSeat();
        assertEquals("A", seat3.getRow());
        assertEquals("4", seat3.getSeatNumb());

        Seat seat4 = theatreRoom.createSeat();
        assertEquals("A", seat4.getRow());
        assertEquals("5", seat4.getSeatNumb());

        Seat seat5 = theatreRoom.createSeat();
        assertEquals("B", seat5.getRow());
        assertEquals("1", seat5.getSeatNumb());

        Seat seat6 = theatreRoom.createSeat();
        assertEquals("B", seat6.getRow());
        assertEquals("2", seat6.getSeatNumb());
    }
}