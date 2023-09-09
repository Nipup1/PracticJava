package Practic_4_1.box9;

public class Chair extends Furniture{
    private int x;
    private int y;
    private int z;

    public Chair(int cost, String color, int x, int y, int z) {
        super(cost, color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getV() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Стул {" +
                "цена = " + cost +
                ", цвет = " + color +
                ", объём = " + getV() +
                " }";
    }
}
