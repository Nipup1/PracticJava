package Practic_4.box2;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Галстук { " + getSize() + "; цвет: " + getColor() + "; цена: " + getCost() + "р. }";
    }
}
