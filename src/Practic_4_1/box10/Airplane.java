package Practic_4_1.box10;

public class Airplane extends Transport{
    public Airplane(int speed, int mest) {
        super(speed, mest);
    }

    @Override
    public double cost(){
        return (1000/speed)/mest + 10;
    }

    @Override
    public String toString() {
        return "Самолёт { время = "+ time()+ ", цена = " + (int)cost() + " }";
    }
}
