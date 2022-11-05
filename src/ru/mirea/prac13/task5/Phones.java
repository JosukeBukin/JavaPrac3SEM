package ru.mirea.prac13.task5;

public class Phones {
    private StringBuffer standardizedNumber;

    public Phones(StringBuffer str){
        standardizedNumber = new StringBuffer(str);
        if (standardizedNumber.charAt(0) == '8'){
            standardizedNumber.deleteCharAt(0);
            standardizedNumber.insert(0, "+7"); // меняем 8 на +7
        }

        // на 5 9 и 13 позициях нужно поставить -
        standardizedNumber.insert(5,'-');
        standardizedNumber.insert(9,'-');
    }

    @Override
    public String toString() {
        return "Phone number:" + standardizedNumber;
    }
}

