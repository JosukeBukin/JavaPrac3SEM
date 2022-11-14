package ru.mirea.prac13.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        FirstTask(input);
    }
    public static void FirstTask(String str){
        System.out.println(str.charAt(str.length()-1));
        if (str.endsWith("!!!")){
            System.out.println("Ending is \"!!!\"");
        }
        else {
            System.out.println("Ending isn't \"!!!\"");
        }
        if (str.startsWith("I like")){
            System.out.println("Starts with \"I like\"");
        }
        else {
            System.out.println("Doesn't starts with \"I like\"");
        }
        if (str.contains("Java")){
            System.out.println("\"Java\" is contains");
        }
        else{
            System.out.println("\"Java\" isn't contains");
        }
        if (str.contains("Java")){
            System.out.println(str.indexOf("Java"));
        }
        else{
            System.out.println("Java isn't contains");
        }
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        if (str.contains("Java")){
            String jv = str.substring(str.indexOf("Java"), str.indexOf("Java")+4);
            System.out.println(jv);
        }
        else{
            System.out.println("Java doesn't contains");
        }
    }
}

