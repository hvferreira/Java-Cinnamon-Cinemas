package org.example;

import java.util.HashMap;

public class TheatreRoom {
    private Movie film;

    private HashMap<String, Integer> room;
    private String lastSeatOccupied;
    private final String emptyRoom = "A0";
    private final int ColumnStart = 1;
    private final int ColumnEnd = 5;

    public TheatreRoom() {
        this.film = new Movie();
        room = new HashMap<>();
        lastSeatOccupied = "emptyRoom";
    }

    public int roomSize() {
        return room.size();
    }


}
