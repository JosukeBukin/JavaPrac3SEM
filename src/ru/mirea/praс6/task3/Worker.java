package ru.mirea.praс6.task3;

import ru.mirea.praс6.task3.Person;

public class Worker extends Person {
    private String place;
    public Worker(String name, String surname, String place) {
        super(name, surname);
        this.place = place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
