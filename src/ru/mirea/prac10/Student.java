package ru.mirea.prac10;

public class Student {
    private String Name, Surname, Specialty, Group;
    private int Course;
    private double GPA;

    public Student() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname){
        this.Surname = surname;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty){
        this.Specialty = specialty;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group){
        this.Group = group;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course){
        this.Course = course;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gpa) {
        this.GPA = gpa;
    }

    public Student(String name, String surname, int course, String group, String specialty, double gpa) {
        Name = name;
        Surname = surname;
        Course = course;
        Group = group;
        Specialty = specialty;
        GPA = gpa;
    }

}
