package com.company;

public class BedRoom {
    private int nightStand, wardrobe;
    private Bed bed;
    private Lamp lamp;
    private Room room;

    public BedRoom(Bed bed, int nightStand, Lamp lamp, int wardrobe, Room room) {
        this.bed = bed;
        this.nightStand = nightStand;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }
}
