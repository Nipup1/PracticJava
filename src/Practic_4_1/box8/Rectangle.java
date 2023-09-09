package Practic_4_1.box8;

public class Rectangle extends Share{
    protected double width;
    protected double lendth;

    public Rectangle() {
    }

    public Rectangle(double width, double lendth) {
        this.width = width;
        this.lendth = lendth;
    }

    public Rectangle(String color, boolean filled, double width, double lendth) {
        super(color, filled);
        this.width = width;
        this.lendth = lendth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLendth() {
        return lendth;
    }

    public void setLendth(double lendth) {
        this.lendth = lendth;
    }

    @Override
    public double getP(){
        return 2*(width);
    }

    @Override
    public double getS(){
        return lendth*width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "тип = прямоугольник, " +
                "периметр = " + getP() +
                ", площадь = " + getS() + " }";
    }
}
