package ru.mirea.prac18.task8;

import java.util.Scanner;

public class ThrowsDemo {

    //Задание 8
    /*В данной программе мы добавили цикл в метод getKey, сделав его рекурсивным, если в блоке
    try возникает ошибка, она обрабатывается в блоке catch, в котором вызывается данный метод еще
    раз. Поэтому пользователь получает второй шанс ввести нужную непустую строку. Этот цикл происходит
    до тех пор пока пользователь не введет непустную строку.
     */
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        try{
            printDetails(key);
        } catch (Exception e){
            System.out.println("Key set to empty string");
            getKey();
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
