package ru.mirea.prac2.task3;

public class Circle {
    private final Point c;

    public Circle(double x, double y) {
        c = new Point(x, y);
    }

    public void newPoint(double x, double y) {
        Point point = new Point(x, y);
    }
    public void setC(double x, double y) { c.setXY(x, y); }
}
