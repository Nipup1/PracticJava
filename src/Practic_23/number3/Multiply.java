package Practic_23.number3;

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return left.evaluate(x, y ,z) * right.evaluate(x, y ,z);
    }
}
