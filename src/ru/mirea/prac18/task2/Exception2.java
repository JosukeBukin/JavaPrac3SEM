package ru.mirea.prac18.task2;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();

        //Задание 2.1-2.2
        /*Мы запускаем эту программу с этим кодом, вводя такие данные: Qwerty, 0, 1.2, 1. В результате
        в первых трех случаях возникают исключения разных классов NumberFormatException,
        ArithmeticException, NumberFormatException соответственно. Исключения NumberFormatException
        происходят в момент вызова метода parseInt, когда метод не может считать число из
        строки. Исключение ArithmeticException при попытке  2 разделить на 0. В четвертом случае программа
        выводит ответ 2.
         */
        /*
        int i = Integer.parseInt(intString);
        System.out.println(2/i);
        */

        //Задание 2.3
        /*Изменим код, добавив блоки try-catch, причем для каждого объекта исключения созаем свой блок
        catch. Если возникает исключение NumberFormatException, программа выводит "It is not a number",
        ArithmeticException -  "Attempted division by zero".
        */
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
