package ru.mirea.praс8.task17;

import java.util.Scanner;

public class Main {
    public static int findMax() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int max = 0;
        if(number > 0) {
            max = findMax();
        }
        return number > max ? number:max;
    }

    public static void main(String[] args) {
        System.out.println(findMax());
    }
}
