package org.example;

import java.util.Random;

public class Cinnamon {


    private Customer customer;
    private TheatreRoom theatreRoom;
    private final int ROOMSIZE = 15;

    private final int MAXNUMTICKET = 3;
    private final int MINNUMTICKET = 1;

    public Customer getCustomer() {
        return customer;
    }

    public TheatreRoom getTheatreRoom() {
        return theatreRoom;
    }

    public Cinnamon() {
        this.customer = new Customer();
        this.theatreRoom = new TheatreRoom();
    }


    public int random() {
        Random random = new Random();
        return random.nextInt((MAXNUMTICKET - MINNUMTICKET) + 1) + MINNUMTICKET;
    }

    public void numOfTickets() {
        int numRandom = random();
        int i = 0;
        while (i < numRandom) {
            if (theatreRoom.roomSize() < ROOMSIZE) {
                Ticket ticket = new Ticket(theatreRoom.getFilm(), theatreRoom, theatreRoom.createSeat());
                customer.setTicketList(ticket);
            } else {
                i = numRandom;
                System.out.println("ROOM IS FULL");
            }
            i++;
        }
    }
}
