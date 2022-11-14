package ru.mirea.prac23.task4;

import ru.mirea.prac23.task4.object.Const;
import ru.mirea.prac23.task4.object.Variable;
import ru.mirea.prac23.task4.operation.unchecked.Add;
import ru.mirea.prac23.task4.operation.unchecked.Multiply;
import ru.mirea.prac23.task4.operation.unchecked.Subtract;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int ans = new Add(new Multiply(new Variable("x"), new Multiply(new Subtract(new Variable("x"),
                new Const(2)), new Variable("z"))),new Const(2)).evaluate(x,y,z);
        System.out.println(ans);
    }
}
