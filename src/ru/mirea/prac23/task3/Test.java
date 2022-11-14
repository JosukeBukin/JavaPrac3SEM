package ru.mirea.prac23.task3;

import ru.mirea.prac23.task3.object.Const;
import ru.mirea.prac23.task3.object.Variable;
import ru.mirea.prac23.task3.operation.Add;
import ru.mirea.prac23.task3.operation.Multiply;
import ru.mirea.prac23.task3.operation.Subtract;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int ans = new Add(new Multiply(new Variable("x"), new Variable("x")),
                new Subtract(new Const(1), new Multiply(new Const(2), new Variable("x")))).evaluate(x);
        System.out.println(ans);
    }
}
