package Practic_4.box2;

public abstract class Clothes {
    private Sizes size;
    private int cost;
    private String color;

    public Clothes(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
