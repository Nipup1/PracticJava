package Practic_4_1.box8;

abstract class Share {
    protected String color;
    protected boolean filled;

    public Share() {
    }

    public Share(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getS();
    abstract double getP();

    @Override
    public String toString() {
        return "Фигура { цвет = " + color + ", заполненность = " + filled + ", ";
    }
}
