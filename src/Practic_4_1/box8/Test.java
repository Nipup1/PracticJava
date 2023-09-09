package Practic_4_1.box8;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("красный", true, 10);
        Rectangle sqare = new Rectangle("чёрный", true, 25, 10);

        System.out.println(sqare.toString());
        System.out.println("----------------------------------");
        System.out.println(circle);
    }
}
