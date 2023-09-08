package Practic_4.box2;

public class Pants extends Clothes implements MenClothing,WomenClothing{
    public Pants(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Штаны { " + getSize() + "; цвет: " + getColor() + "; цена: " + getCost() + "р. }";
    }
}
