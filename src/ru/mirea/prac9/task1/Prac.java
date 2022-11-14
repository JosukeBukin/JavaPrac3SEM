package ru.mirea.prac9.task1;

import java.util.ArrayList;


class TestInsertionSort {
    ArrayList<Student> iDNumber;

    TestInsertionSort() {
        this.iDNumber = new ArrayList<>();
        iDNumber.add(new Student(123));
        iDNumber.add(new Student(122));
        iDNumber.add(new Student(12));
        iDNumber.add(new Student(123));
        iDNumber.add(new Student(13));
        iDNumber.add(new Student(123));
        iDNumber.add(new Student(1023));
    }

    public void insertionSort() {
        for (int left = 0; left < iDNumber.size(); left++) {
            Student temp = iDNumber.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (temp.compareTo(iDNumber.get(i)) < 1) {
                    iDNumber.set(i + 1, iDNumber.get(i));
                } else {
                    break;
                }
            }
            iDNumber.set(i + 1, temp);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student student : iDNumber) {
            result.append("\n").append(student.getId());
        }
        return result.toString();
    }
}

class Student implements Comparable<Student> {
    private final int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getId() < o.getId()) {
            return 0;
        } else {
            return 1;
        }
    }
}

public class Prac {
    public static void main(String[] args) {
        TestInsertionSort testInsertionSort = new TestInsertionSort();
        testInsertionSort.insertionSort();
        System.out.println(testInsertionSort);
    }
}