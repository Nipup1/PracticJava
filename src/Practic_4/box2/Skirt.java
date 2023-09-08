package Practic_4.box2;

public class Skirt  extends Clothes implements WomenClothing{
    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Юбка { " + getSize() + "; цвет: " + getColor() + "; цена: " + getCost() + "р. }";
    }
}
