package Practic_4_1.box10;

public class Ship extends Transport{
    public Ship(int speed, int mest) {
        super(speed, mest);
    }

    @Override
    public double cost(){
        return (1000/speed)/mest + 8;
    }

    @Override
    public String toString() {
        return "Корабль { время = "+ time()+ ", цена = " + (int)cost() + " }";
    }
}
