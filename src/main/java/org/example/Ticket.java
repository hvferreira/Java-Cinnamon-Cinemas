package org.example;

public class Ticket {

    private Movie movie;
    private TheatreRoom theatreRoom;
    private Seat seat;

    public Ticket(Movie movie, TheatreRoom theatreRoom, Seat seat) {
        this.movie = movie;
        this.theatreRoom = theatreRoom;
        this.seat = seat;
    }
}
