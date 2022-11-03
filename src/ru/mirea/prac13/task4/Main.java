package ru.mirea.prac13.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] shirts = new String[] {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black TShirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        // создаём массив с данными о футболках

        ArrayList<Shirt> arrayList = new ArrayList<>(); // создаём массив объектов класса футболок

        for (int i = 0; i < shirts.length; i++){
            arrayList.add(new Shirt(shirts[i]));
        } // заполняем наш массив

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).toString());
        } // выводим значение возвращаемое методом toString для каждого элемента массива объектов


    }
}
