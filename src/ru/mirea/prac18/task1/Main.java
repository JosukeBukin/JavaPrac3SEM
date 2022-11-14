package ru.mirea.prac18.task1;

public class Main {
    public static void main(String[] arg) {
        Exception1 ex1 = new Exception1();
        Exception1.exceptionDemo();
    }
}
class Exception1 {
    public static void exceptionDemo(){

        //Задание 1.1
        /*При выполнении программа пытается выполнить деление на нуль, в результате чего создается
        объект исключения класса ArithmeticException, который передается обработчику по умолчанию и
        программа завршает свою работу, так как другой обработки этой ошибки в методе не предусмотрено.
         */
        //System.out.println(2 / 0);

        //Задание 1.2
        /*Данная программа к ошибке не приводит, а приводит к результату INFINITY, этого из-за
        специфичности представления чисел 0, а такжевозможности представить +- бесконечность в
        формате чисел с плавающей точкой.
         */
        //System.out.println(2.0 / 0.0);

        //Задание 1.3
        /*В блоке try происходит деление на 0, из-за чего возникает объект исключения класса
        ArithmeticException, который перехватывается и передается в качестве аргумента блоку catch.
        Данный блок catch выполняет только то исключение, которое указано у него в качестве параметра.
        В результате программа выводит строку "Attempted division by zero" при этом программа не завершает
        работу, как это было раньше.
         */
        try{
            System.out.println(2/0);
        } catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
    }
}
