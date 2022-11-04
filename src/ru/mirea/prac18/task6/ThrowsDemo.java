package ru.mirea.prac18.task6;

public class ThrowsDemo {

    //Задание 6.1-6.2
    /*Уберем блоки try-catch и добавим метод printMessage, который будет вызывать метод getDetails.
    При передаче в качестве аргумента null создается исключение NullPointerException, которое будет
    проброшено сначала из метода getDetails метод printMessage, а потом из метода printMessage в функцию
    main, где его обработает обработчик исключений по умолчанию и на экране появится запись:
    NullPointerException: null key in getDetails. Если аргумент будет не null, а "exception", то на экране
    появится запись: data for exception.
     */
    /*
    public void printMessage(String key){
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key){
        if(key==null){
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    */

    //Задание 6.3
    /*Если в метод printMessage добавить блоки try-catch, то при возникновении исключения, оно
    обработается в блоке catch.
     */
    public void printMessage(String key){
        try{
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("null key in getDetails");
        }
    }
    public String getDetails(String key){
        if(key==null){
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
