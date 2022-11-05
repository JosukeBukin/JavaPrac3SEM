package ru.mirea.prac13.task3;

public class Main {
    public static void main(String[] args) {
        Adress adr1 = new Adress();
        adr1.SetAdress1("Russia, Ural, Perm, Ekaterininskaya, 30, 1, 15");
        System.out.println(adr1.toString()); //тестируем перевый метод решения через split()
        adr1.SetAdress2("Russia, Ural, Perm, Ekaterininskaya, 30, 1, 15");
        System.out.println(adr1.toString()); // тестируем метод покруче с токенайзером
    }
}
