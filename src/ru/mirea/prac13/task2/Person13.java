package ru.mirea.prac13.task2;

public class Person13 {
    private String name;
    private String secondName;
    private String fatherName;

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

    public void setName13(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFatherName() {
        return fatherName;
    }
}

