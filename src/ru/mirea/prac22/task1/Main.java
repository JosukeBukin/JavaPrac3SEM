package ru.mirea.prac22.task1;
import java.util.Stack;
class Calculator {
    Stack<Float> num = new Stack<>();
    void add(Object addition){
        if(addition.getClass().getName() == "java.lang.Float"){
            num.push((float)addition);
        }
        else if(!num.isEmpty()){
            float b = num.pop();
            float a = num.pop();
            switch ((char)addition){
                case '*':
                    num.push(a * b);
                    break;
                case '/':
                    num.push(a / b);
                    break;
                case '+':
                    num.push(a + b);
                    break;
                case '-':
                    num.push(a - b);
                    break;
                default:
                    System.out.println("Неверно заданная операция");
            }
        }
        else{System.out.println("Невозможно выполнить операцию с одним числом");}}
    float check(){
        return num.peek();
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add((float)55);
        calc.add((float)104.6);
        calc.add((float)5);
        calc.add('-');
        calc.add('*');
        calc.add((float)10);
        calc.add('/');
        System.out.println(calc.check());
    }
}
