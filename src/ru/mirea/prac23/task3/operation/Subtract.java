package operation;


import expression.TripleExpression;
import expression.SingleExpression;

public class Subtract extends Operation {
    public Subtract(SingleExpression left, SingleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }

    protected double evaluate(double left, double right) {
        return left - right;
    }
}
