package ru.mirea.prac9.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Prac {
    static ArrayList<Student> students = new ArrayList<>();
    static SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();


    public static void main(String[] args) {
        students.add(new Student(12));
        students.add(new Student(145));
        students.add(new Student(122));
        students.add(new Student(1));
        students.add(new Student(4));
        students.add(new Student(64));
        students.add(new Student(83));
        students.add(new Student(45));
        students.add(new Student(42));
        students.add(new Student(76));
        students.add(new Student(1001));
        students.add(new Student(100));
        students.add(new Student(129));
        students.add(new Student(128));
        sortingStudentsByGPA.quickSort(students, 0, students.size() - 1);

        for (int i = students.size()-1  ;i>=0;i--) {
            System.out.println(students.get(i).getId());
        }

    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }

    public void quickSort(ArrayList<Student> students, int low, int high) {
        if (students.size() == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (compare(students.get(i), opora) > 0) {
                i++;
            }

            while (compare(students.get(j), opora) < 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }
}

class Student {
    private final int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

