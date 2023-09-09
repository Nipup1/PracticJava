package Practic_4_1.box10;

public class Test {
    public static void main(String[] args) {
        Transport[] tran = new Transport[]{
                new Train(80, 400),
                new Ship(50, 300),
                new Airplane(240, 100),
                new Car(120, 5)
        };

        for(Transport el: tran){
            System.out.println(el);
        }
    }
}
