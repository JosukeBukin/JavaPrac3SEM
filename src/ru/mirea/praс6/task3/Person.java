package ru.mirea.praс6.task3;

import ru.mirea.praс6.task3.Nameable;

public class Person implements Nameable {
    private final String name;
    private final String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String getName() {
        return this.name+" "+this.surname;
    }
}
