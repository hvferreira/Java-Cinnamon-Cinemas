package org.example;

import java.util.HashMap;

public class TheatreRoom {
    private Movie film;
    private HashMap<String, Integer> room;
    private String lastSeatOccupied;
    private final String EMPTYROOM = "A0";

    private final String ROW = "ABC";
    private int positionRow = 0;

    public Movie getFilm() {
        return film;
    }

    public TheatreRoom() {
        this.film = new Movie();
        room = new HashMap<>();
        lastSeatOccupied = EMPTYROOM;
    }

    public int roomSize() {
        return room.size();
    }


    public Seat createSeat() {
        if (lastSeatOccupied.charAt(1) == '5') {
            positionRow = positionRow + 1;
            lastSeatOccupied = String.valueOf(ROW.charAt(positionRow)) + "1";
            room.put(lastSeatOccupied, 1);
            return new Seat(String.valueOf(ROW.charAt(positionRow)), "1");
        } else {
            int numb = Integer.parseInt(String.valueOf(lastSeatOccupied.charAt(1))) + 1;
            lastSeatOccupied = String.valueOf(ROW.charAt(positionRow)) + String.valueOf(numb);
            room.put(lastSeatOccupied, 1);
            return new Seat(String.valueOf(ROW.charAt(positionRow)), String.valueOf(numb));
        }
    }
}










