package ru.mirea.prac25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidation {
    public static boolean validate(String ip){
        String dotDecimalIpRegex =
                "^([01]?\\d\\d? | 2[0-4]\\d | 25[0-5])\\." +
                "([01]?\\d\\d? | 2[0-4]\\d | 25[0-5])\\." +
                "([01]?\\d\\d? | 2[0-4]\\d | 25[0-5])\\." +
                "([01]?\\d\\d? | 2[0-4]\\d | 25[0-5])$";
        Pattern pattern = Pattern.compile(dotDecimalIpRegex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(validate(s.next()) ? "This IP address is valid" : "This IP address is NOT valid");
    }
}
