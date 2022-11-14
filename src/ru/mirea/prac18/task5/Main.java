package ru.mirea.prac18.task5;

public class Main {
    public static void main(String[] arg){
        ThrowsDemo th1=new ThrowsDemo();
        th1.getDetails(null);
    }
}
class ThrowsDemo {

    //Задание 5.1
    /*Создадим класс, в котором будет создано и проброшено c помощью оператора throw
    исключение класса NullPointerException. В функции main мы создадим экземпляр этого
    класса и вызовем для него метод getDetails параметром null. Тогда при выполнении программы
    исключение проброситься из метода getDetails в функцию main и будет использован обработчик
    по умолчанию, который остановит действие программы.
     */
    /*
    public void getDetails(String key){
        if (key==null){
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("This is your key: "+key);
    }
     */

    //Задание 5.2
    /*Добавим блок try-catch, чтобы ошибка была перехвачена и обработана внутри метода. После проверки
    условия в  программе выбрасывается исключение, которое перехватывается в блоке catch.
     */
    public void getDetails (String key) {
        try{
            if (key==null){
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("This is your key: "+key);
        } catch(NullPointerException e){
            System.out.println("null key in getDetails");
        }
    }
}
