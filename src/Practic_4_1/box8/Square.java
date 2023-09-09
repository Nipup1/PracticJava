package Practic_4_1.box8;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        lendth = side;
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
                "тип = квадрат, " +
                "периметр = " + getP() +
                ",площадь = " + getS() + " }";
    }
}
