package ru.mirea.prac18.task4;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();

        //Задание 4
        /*После выполнения блоков try-catch, программа выполняет инструкции блока finally, независимо от
        от того было ли создано исключение или нет.
         */
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        finally {
            System.out.println("Execution of the finally block");
        }
    }
}
