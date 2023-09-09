package Practic_4_1.box9;

import java.util.AbstractSequentialList;

abstract class Furniture {
    protected int cost;

    protected String color;

    public Furniture(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    abstract int getV();
}
