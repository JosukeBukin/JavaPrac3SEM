package ru.mirea.prac18.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Exception2 ex2=new Exception2();
        Exception2.exceptionDemo();
    }
}
class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();

        //Задание 3
        /*Если добавить блок с параметром суперкласса Exception, прогамма выдает ошибку, потому что не
        знает какие инструкции ей выполнять, так как классы NumberFormatException и ArithmeticException
        являются производными от класса Exception, соответсвенно их объекты также принадлежат классу
        Exception.
         */
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            //} catch (Exception e) { System.out.println("There is a problem"); //Если добавить будет ошибка
        } catch (NumberFormatException e) {
            System.out.println("It is not a number");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
