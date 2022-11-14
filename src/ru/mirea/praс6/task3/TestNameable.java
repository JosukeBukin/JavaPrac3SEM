package ru.mirea.praс6.task3;

public class TestNameable {
    public static void main(String[] args) {
        Dog dog = new Dog("Rookie");
        System.out.println(dog.getName());
        Person person = new Person("Ivan", "Ivanov");
        System.out.println(person.getName());
        Worker worker = new Worker("Ivan", "Petrov", "Banker");
        System.out.println(worker.getName());
    }
}
