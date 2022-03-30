package org.oop;

public class Point {

    private final double x;
    private final double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2)
                + Math.pow(p.y - this.y, 2));
    }

    public double direction(Point p) {
        return Math.atan2((p.y - this.y), (p.x - this.x));
    }

}

