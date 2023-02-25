package org.example;

public class Seat {

    private String row;
    private String seatNumb;

    public String getRow() {
        return row;
    }

    public String getSeatNumb() {
        return seatNumb;
    }

    public Seat(String row, String seatNumb) {
        this.row = row;
        this.seatNumb = seatNumb;
    }
}
