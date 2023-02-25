package org.example;

import java.util.Random;

public class Cinnamon {


    private Customer customer;
    private TheatreRoom theatreRoom;


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

        return random.nextInt((3 - 1) + 1) + 1;
    }
}
