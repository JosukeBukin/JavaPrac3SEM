package ru.mirea.prac23.task4.operation.checked;

import ru.mirea.prac23.task4.exceptions.ArithmeticParserException;
import ru.mirea.prac23.task4.expression.TripleExpression;
import ru.mirea.prac23.task4.operation.UnaryOperation;

public class CheckedNegate extends UnaryOperation {
    public CheckedNegate(TripleExpression object) {
        super(object);
    }

    protected int evaluate(int object) {
        if (object == Integer.MIN_VALUE)
            throw new ArithmeticParserException("Overflow exception : -(" + object + ")");
        return -object;
    }
}
