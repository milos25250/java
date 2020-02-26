package com.company;

public class Room {
    private int floor, window, door;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;

//  constructor chaining
    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, int window, int door) {
        this(wall1, wall2, wall3, wall4, ceiling, 1, window, door);
    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, int floor, int window, int door) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.floor = floor;
        this.window = window;
        this.door = door;
    }

//  accessing a private variable's value without being able to access it directly from the main method
    public void printWallColor() {
        System.out.println("The color of the wall is " + getWall1().getColor());
    }

    private Wall getWall1() {
        return wall1;
    }

//  accessing a private variable's value from anywhere, including the main method
    public int getWindow() {
        return window;
    }
}
