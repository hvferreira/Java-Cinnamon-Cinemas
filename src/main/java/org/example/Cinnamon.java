package org.example;

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


}
