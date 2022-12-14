package ru.mirea.prac23.task4.operation.checked;

import ru.mirea.prac23.task4.exceptions.ArithmeticParserException;
import ru.mirea.prac23.task4.expression.TripleExpression;
import ru.mirea.prac23.task4.operation.BinaryOperation;

public class CheckedDivide extends BinaryOperation {
    public CheckedDivide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if ((left == Integer.MIN_VALUE) && (right == -1)) {
            throw new ArithmeticParserException("Overflow : " + left + "/" + right);
        }
        if (right == 0)
            throw new ArithmeticParserException(left + "/" + right);
        return left / right;
    }
}
