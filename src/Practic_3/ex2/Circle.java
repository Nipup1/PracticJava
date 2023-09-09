package Practic_3.ex2;

import java.util.Random;

public class Circle {
    private Point point;
    private int r;

    public Circle(int r) {
        Random rand = new Random();
        this.point = new Point(rand.nextDouble(), rand.nextDouble());
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Practic_4_1.box8.Circle { " +
                point.toString() +
                ", r = " + r +
                " }";
    }
}
