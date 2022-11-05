package ru.mirea.prac18.task7;

import java.util.Scanner;

public class ThrowsDemo {

    //Задание 7.1
    /*При попытке скомпилировать данную программу, выдается ошибка: Unreported java.lang.Exception.
    Исключение класса Exception вляется некотролируемым, а в Java все выбрасываемые в методе
    неконтролируемые ошибки, которые им не обрабатываются, должны быть указаны в сигнатуре метода
    оператором throws. Исключение Exception выбрасывается из метода getDetails, потом из метода
    printDetails, причем ни в одном из методов оно не обрабатывается.
     */
    /*
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e){
           throw e;
        }
    }
    private String getDetails(String key) {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
    */

    //Задание 7.1 Первый способ решения проблемы
    /*Эту проблему можно решить, если обработать ошибку внутри метода getDetails, где исключение
    появляется изначально.
     */
    /*
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key){
        try{
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
        } catch (Exception e) {
            System.out.println("Key set to empty string");
        }
        return "data for " + key;
    }
    */

    //Задание 7.1 Второй способ решения проблемы
    /*Другой способ решения этой проблемы заключается в том, чтобы выделять в сигнатуре методов
    выбрасываемые исключения, с помощью оператора throws, а в одном из методов эти исключения обрабатывать
    с помощью блоков try-catch.
     */
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        try{
            printDetails(key);
        } catch (Exception e){
            System.out.println("Key set to empty string");
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception{
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
