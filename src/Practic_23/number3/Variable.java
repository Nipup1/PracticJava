package Practic_23.number3;

class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        if(name == "x")
            return x;

        else if(name == "y")
            return y;

        else
            return z;
    }
}
