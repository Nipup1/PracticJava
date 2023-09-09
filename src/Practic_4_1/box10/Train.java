package Practic_4_1.box10;

public class Train extends Transport{
    public Train(int speed, int mest) {
        super(speed, mest);
    }

    @Override
    public double cost(){
        return (1000/speed)/mest + 38;
    }

    @Override
    public String toString() {
        return "Поезд { время = "+ time()+ ", цена = " + (int)cost() + " }";
    }
}
