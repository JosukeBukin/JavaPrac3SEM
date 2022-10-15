package ru.mirea.prac9.task3;

import java.util.ArrayList;

public class Prac {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList_1 = new ArrayList<>();
        studentArrayList_1.add(new Student(1));
        studentArrayList_1.add(new Student(4));
        studentArrayList_1.add(new Student(8));
        studentArrayList_1.add(new Student(13));
        studentArrayList_1.add(new Student(123));
        studentArrayList_1.add(new Student(12));
        studentArrayList_1.add(new Student(1));
        studentArrayList_1.add(new Student(176));
        studentArrayList_1.add(new Student(3241));
        studentArrayList_1.add(new Student(1436));
        ArrayList<Student> studentArrayList_2 = new ArrayList<>();
        studentArrayList_2.add(new Student(13));
        studentArrayList_2.add(new Student(41));
        studentArrayList_2.add(new Student(87));
        studentArrayList_2.add(new Student(183));
        studentArrayList_2.add(new Student(1865));
        studentArrayList_2.add(new Student(1231));
        studentArrayList_2.add(new Student(152));
        studentArrayList_2.add(new Student(1));
        studentArrayList_2.add(new Student(18765));
        studentArrayList_2.add(new Student(1676));
        studentArrayList_2.add(new Student(321));
        studentArrayList_2.add(new Student(136));
        studentArrayList_1.addAll(studentArrayList_2);
        MergeSort<Student> studentMergeSort = new MergeSort<>();
        studentMergeSort.mergeSort(studentArrayList_1);
        for (Student student : studentArrayList_1
        ) {
            System.out.println(student.getId() + " ");
        }
    }
}

class MergeSort<E extends Comparable<E>> {
    void mergeSort(ArrayList<E> arrayList) {
        if (arrayList.size() > 1) {
            E cursor = arrayList.get(arrayList.size()/2);
            ArrayList<E> arrayListRight = new ArrayList<>();
            ArrayList<E> arrayListLeft = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if(i!=arrayList.size()/2)
                if (arrayList.get(i).compareTo(cursor) < 0) {
                    arrayListLeft.add(arrayList.get(i));
                } else {
                    arrayListRight.add(arrayList.get(i));
                }
            }
            mergeSort(arrayListLeft);
            mergeSort(arrayListRight);
            arrayListLeft.add(cursor);
            arrayListLeft.addAll(arrayListRight);
            arrayList.clear();
            arrayList.addAll(arrayListLeft);
        }
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
        if (this.getId() > o.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
