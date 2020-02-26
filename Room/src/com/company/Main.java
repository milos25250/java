package com.company;

public class Main {

    public static void main(String[] args) {
//      initializing the Room object and the Bedroom objects
        Wall wall1 = new Wall(3.5, 2.7, "red");
        Wall wall2 = new Wall(5, 2.7, "blue");
        Wall wall3 = new Wall(3.5, 2.7, "yellow");
        Wall wall4 = new Wall(5, 2.7, "green");
        Ceiling ceiling = new Ceiling(false);
        Room room = new Room(wall1, wall2, wall3, wall4, ceiling, 2, 1);

        Bed bed = new Bed(4, 1);
        Lamp lamp = new Lamp("lava");
        BedRoom bedRoom = new BedRoom(bed, 1, lamp, 1, room);
//      another possible way of initializing the bedRoom is
//      BedRoom bedRoom = new BedRoom(new Bed(4, 1), 1, new Lamp("lava"), 1, room);

        room.printWallColor();
        System.out.println("The value of room.window is " + room.getWindow());

//      it is possible to access the getWindow() method from the BedRoom object through composition
        System.out.println("The value of bedRoom.room.window is " + bedRoom.getRoom().getWindow());
    }
}
