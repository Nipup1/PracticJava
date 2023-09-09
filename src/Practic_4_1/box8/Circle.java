package Practic_4_1.box8;

public class Circle extends Share{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color, boolean filled, double r) {
        super(color, filled);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getP(){
        return 2*Math.PI*r;
    }

    @Override
    public double getS(){
        return Math.PI*(Math.pow(r,2));
    }

    @Override
    public String toString() {
        return super.toString() +
                "тип = круг, " +
                "периметр = " + getP() +
                ", площадь = " + getS() + " }";
    }
}
