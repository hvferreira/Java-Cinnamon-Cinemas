package org.example;

import java.util.HashMap;

public class TheatreRoom {
    private Movie film;
    private HashMap<String, Integer> room;
    private String lastSeatOccupied;
    private final String EMPTYROOM = "A0";
    private final int COLUMNSTART = 1;
    private final int COLUMNEND = 5;

    private final String ROW = "ABC";

    public TheatreRoom() {
        this.film = new Movie();
        room = new HashMap<>();
        lastSeatOccupied = "emptyRoom";
    }

    public int roomSize() {
        return room.size();
    }


}
