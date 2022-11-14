package ru.mirea.prac13.task4;

import java.util.StringTokenizer;

public class Shirt {
    private final String articular;
    private final String model;
    private final String color;
    private final String size;

    public Shirt(String str){
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        this.articular = tokenizer.nextToken();
        this.model = tokenizer.nextToken();
        this.color = tokenizer.nextToken();
        this.size = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return articular + ", " + model + ", " + color + ", " + size;
    }
}
