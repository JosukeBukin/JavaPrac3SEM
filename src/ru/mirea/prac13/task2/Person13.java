package ru.mirea.prac13.task2;

public class Person13 {
    private final String name;
    private final String secondName;
    private final String fatherName;

    public Person13(){
        name = "unknown";
        secondName = "unknown";
        fatherName = "unknown";
    }

    public Person13(String name){
        this.name = name;
        secondName = "unknown";
        fatherName = "unknown";
    }

    public Person13(String name, String secondName, String fatherName){
        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

