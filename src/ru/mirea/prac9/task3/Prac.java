package ru.mirea.prac9.task3;

import java.util.ArrayList;

public class Prac {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList_1 = new ArrayList<>();
        ArrayList<Student> studentArrayList_2 = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            studentArrayList_1.add(new Student((int) (Math.random()*100)));
            studentArrayList_2.add(new Student((int) (Math.random()*100)));
        }
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
            ArrayList<E> arrayListLeft = new ArrayList<>(arrayList.subList(0, arrayList.size() / 2));
            ArrayList<E> arrayListRight = new ArrayList<>(arrayList.subList(arrayList.size() / 2, arrayList.size()));
            mergeSort(arrayListLeft);
            mergeSort(arrayListRight);
            int l = 0;
            int r = 0;
            arrayList.clear();
            for (int i = 0; i < arrayListLeft.size() + arrayListRight.size(); i++) {
                if (l != arrayListLeft.size() && r != arrayListRight.size() &&
                        arrayListLeft.get(l).compareTo(arrayListRight.get(r)) < 0) {
                    arrayList.add(i, arrayListLeft.get(l));
                    l++;
                } else if (l != arrayListLeft.size() && r != arrayListRight.size()) {
                    arrayList.add(i, arrayListRight.get(r));
                    r++;
                }
                if (l == arrayListLeft.size() && l != 0) {
                    arrayList.addAll(arrayListRight.subList(r, arrayListRight.size()));
                    break;
                } else if (r == arrayListRight.size() && r != 0) {
                    arrayList.addAll(arrayListLeft.subList(l, arrayListLeft.size()));
                    break;
                }

            }
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
