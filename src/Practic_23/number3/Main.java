package Practic_23.number3;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Main <x> <y> <z>");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        // Вычисляем значение выражения x^2 - 2x + 1
        Expression expression1 = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        // Вычисляем значение выражения x * (y-2) * z + 1
        Expression expression2 = new Add(
                new Multiply(
                        new Variable("x"),
                        new Multiply(
                                new Subtract(
                                        new Variable("y"),
                                        new Const(2)),
                                new Variable("z"))),
                new Const(1));


        int result1 = expression1.evaluate(x, y, z);
        int result2 = expression2.evaluate(x, y, z);
        System.out.println("Result: " + result1);
        System.out.println("Result: " + result2);
    }
}
