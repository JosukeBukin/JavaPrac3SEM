package ru.mirea.prac10;

public class Student {
    private String name, surname, specialty, group;
    private int course;
    private double gpa;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(String name, String surname, int course,
                   String group, String specialty, double gpa) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.specialty = specialty;
        this.gpa = gpa;
    }
    public Student() {
    }
}
