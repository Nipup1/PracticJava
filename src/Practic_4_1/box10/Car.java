package Practic_4_1.box10;

public class Car extends Transport{
    public Car(int speed, int mest) {
        super(speed, mest);
    }

    @Override
    public double cost(){
        return (1000/speed)/mest + 76;
    }

    @Override
    public String toString() {
        return "Машина { время = "+ time()+ ", цена = " + (int)cost() + " }";
    }
}
