package ru.mirea.prac13.task4;

import java.util.StringTokenizer;

public class Shirt {
    private String articul;

    private String model;

    private String color;

    private String size;

    public Shirt(String str){
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        this.articul = tokenizer.nextToken();
        this.model = tokenizer.nextToken();
        this.color = tokenizer.nextToken();
        this.size = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return articul + ", " + model + ", " + color + ", " + size;
    }
}
