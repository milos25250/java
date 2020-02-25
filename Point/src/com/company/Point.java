package com.company;

public class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0.0 - getX()) * (0.0 - getX()) + (0.0 - getY()) * (0.0 - getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Point point) {
        return Math.sqrt((point.getX() - getX()) * (point.getX() - getX()) + (point.getY() - getY()) * (point.getY() - getY()));
    }
}
