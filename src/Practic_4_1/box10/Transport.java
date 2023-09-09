package Practic_4_1.box10;

public abstract class Transport {
    protected int speed;

    protected int mest;

    public Transport(int speed, int mest) {
        this.speed = speed;
        this.mest = mest;
    }

    abstract double cost();
    public double time(){
        return 1000/speed;
    }
}
