package ru.mirea.prac11.src;

import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        Date dateOfStart = new Date(1665858271999L);
        Date dateOfFinish = new Date();
        String surname = "LOL";
        System.out.println("Задача была получаена: " + dateOfStart + "\nСтудентом " + surname + "\nИ сдана: " + dateOfFinish);
    }
}