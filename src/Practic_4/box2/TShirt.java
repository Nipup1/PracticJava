package Practic_4.box2;

public class TShirt extends Clothes implements MenClothing,WomenClothing{
    public TShirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Футболка { " + getSize() + "; цвет: " + getColor() + "; цена: " + getCost() + "р. }";
    }
}
