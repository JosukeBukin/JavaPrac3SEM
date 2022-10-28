package ru.mirea.prac14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static boolean isDate(String str){
        String regex = "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(isDate("29/02/2000"));
        System.out.println(isDate("30/04/2003"));
        System.out.println(isDate("01/01/2003"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("30-04-2003"));
        System.out.println(isDate("1/1/1899"));
    }
}