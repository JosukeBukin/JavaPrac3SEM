package ru.mirea.prac23.task3.operation;

import ru.mirea.prac23.task3.expression.SingleExpression;

public class Multiply extends Operation {

    public Multiply(SingleExpression left, SingleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }

    protected double evaluate(double left, double right) {
        return left * right;
    }

}
