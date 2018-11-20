package ai164.But;

import java.util.ArrayList;

public class Flat {
    private int roomsAmount;
    private ArrayList<Room> rooms;

    public Flat(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    public int getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    public void setRoom(Room rooms) {
        this.rooms.add(rooms);
    }
}
